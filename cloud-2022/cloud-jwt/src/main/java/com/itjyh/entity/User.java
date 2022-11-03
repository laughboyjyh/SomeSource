package com.itjyh.entity;/**
 * @Author: jiayuhang
 * @Date: 2022/10/11/17:17
 * @Description:
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/10/11 17:17
 */
@Data
public class User {
    // 自增长id
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(hidden = true)
    private Integer id;
    private String userName;
    private String passWord;
    @ApiModelProperty(hidden = true)
    private Date createTime;
    @ApiModelProperty(hidden = true)
    private Date lastLogin;
    public  User() {}
    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
