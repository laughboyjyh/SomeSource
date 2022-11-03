package com.itjyh.mapper;/**
 * @Author: jiayuhang
 * @Date: 2022/10/11/17:20
 * @Description:
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itjyh.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/10/11 17:20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
