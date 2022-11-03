package com.itjyh.reggie.controller;/**
 * @Author: jiayuhang
 * @Date: 2022/09/16/11:19
 * @Description:
 */

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itjyh.reggie.common.R;
import com.itjyh.reggie.dto.SetmealDTO;
import com.itjyh.reggie.entity.Category;
import com.itjyh.reggie.entity.Setmeal;
import com.itjyh.reggie.service.CategoryService;
import com.itjyh.reggie.service.SetmealDishService;
import com.itjyh.reggie.service.SetmealService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/9/16 11:19
 * 套餐管理
 */
@RestController
@RequestMapping("/setmeal")
@Slf4j
@Api(tags = "套餐相关接口")

public class SetmealController
{
    @Autowired
    private SetmealService setmealService;
    @Autowired
    private SetmealDishService setmealDishService;

    @Autowired
    private CategoryService categoryService;

    /*新增套餐
    * */

    @PostMapping
    @ApiOperation(value = "新增套餐接口")
public R<String> save(@RequestBody SetmealDTO setmealDTO){
        log.info("套餐信息:{}",setmealDTO);
        setmealService.saveWithSetmeal(setmealDTO);
        return R.success("套餐新增成功");

}



/*套餐分页*/
    @GetMapping("/page")
    @ApiOperation(value="套餐分页查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name="page",value = "页码",required = true),  //必须
            @ApiImplicitParam(name="pageSize",value = "每页记录数",required = true),//必须
            @ApiImplicitParam(name="name",value = "套餐名称",required = false)//非必须

    })
    public R<Page>page(int page,int pageSize,String name){
//        构造分页构造器
        Page<Setmeal>pageInfo=new Page<>(page,pageSize);
        Page<SetmealDTO>setmealDTOPage=new Page<>();
//        构造条件构造器
        LambdaQueryWrapper<Setmeal>queryWrapper=new LambdaQueryWrapper<>();
//        添加过滤条件
        queryWrapper.like(StringUtils.isNotEmpty(name),Setmeal::getName,name);
//        添加排序条件
        queryWrapper.orderByAsc(Setmeal::getUpdateTime);
//        执行查询
        setmealService.page(pageInfo,queryWrapper);
//        对象拷贝
        BeanUtils.copyProperties(pageInfo, setmealDTOPage, "records");
        List<Setmeal> records = pageInfo.getRecords();
        List<SetmealDTO> list = records.stream().map((item) -> {
                    SetmealDTO setmealDTO = new SetmealDTO();
                    BeanUtils.copyProperties(item, setmealDTO);
                    Long categoryId = item.getCategoryId();
//            根据id查询分类对象
           Category category = categoryService.getById(categoryId);
            if (category != null) {
                String categoryName = category.getName();
                setmealDTO.setCategoryName(categoryName);
            }
            return setmealDTO;
        }).collect(Collectors.toList());
        setmealDTOPage.setRecords(list);
        return R.success(setmealDTOPage);
    }

    /**
     * 根据id删除或者批量删除套餐
     * @param id
     * @return
     */
    @DeleteMapping
    @CacheEvict(value = "setmealCache",allEntries = true)
    @ApiOperation(value = "套餐删除接口")
    public R<String> delete(@RequestParam("id") List<Long> id){
        log.info("id:{}",id);

        setmealService.deleteWithDish(id);

        return R.success("套餐数据删除成功");
    }

    /**
     * 修改或批量修改套餐的停售启售状态
     * @param status
     * @param list
     * @return
     */
    @PostMapping("status/{status}")
    @ApiOperation(value = "套餐状态接口")
    public R<String> modify(@PathVariable Integer status,@RequestParam("id") List<Long> list){

        for (Long id:list) {
            Setmeal setmeal = setmealService.getById(id);
            setmeal.setStatus(status);
            setmealService.updateById(setmeal);
        }

        return R.success("套餐状态修改成功");
    }

    /**
     * 根据id查询对应的套餐信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public R<SetmealDTO> get(@PathVariable Long id) {

        SetmealDTO setmealDTO = setmealService.getByIdWithDish(id);

        return R.success(setmealDTO);
    }


    /**
     * 修改套餐内容的方法
     * @param setmealDTO
     * @return
     */
    @PutMapping
    @ApiOperation(value = "套餐修改接口")
    public R<String> update(@RequestBody SetmealDTO setmealDTO){
        log.info(setmealDTO.toString());

        setmealService.updateWithDish(setmealDTO);

        return R.success("套餐修改成功");
    }


    }
