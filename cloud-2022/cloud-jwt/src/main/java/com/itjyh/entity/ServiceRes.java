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
public class ServiceRes {
    private Integer code;
    private String msg;
    private String jwt;
    private ServiceRes() {}
    public ServiceRes(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ServiceRes(Integer code, String msg, String jwt) {
        this.code = code;
        this.msg = msg;
        this.jwt = jwt;
    }
}