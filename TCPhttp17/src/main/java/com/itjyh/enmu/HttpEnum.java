package com.itjyh.enmu;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/8/18 17:30
 */
public enum HttpEnum {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    ;
    private String value;
    HttpEnum(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
