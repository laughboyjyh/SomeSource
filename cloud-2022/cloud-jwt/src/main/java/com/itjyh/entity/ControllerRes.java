package com.itjyh.entity;/**
 * @Author: jiayuhang
 * @Date: 2022/10/11/17:18
 * @Description:
 */

import lombok.Data;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/10/11 17:18
 */
@Data
public class ControllerRes {
    private Integer code;
    private String msg;
    public ControllerRes(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}