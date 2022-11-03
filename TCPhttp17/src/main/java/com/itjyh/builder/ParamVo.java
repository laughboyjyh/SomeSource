package com.itjyh.builder;

import lombok.Data;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/8/17 17:12
 */
@Data
public class ParamVo {
    private String url;
    private String accept;
    private String connection;
    private String contentType;
    private String contentLength;
    private String host;
    private String userAgent;
    private String body;

    @Override
    public String toString() {
        String string = new String();
        Class<?> clazz = this.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            String name = fields[i].getName();
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            try {
                Method m = clazz.getMethod("get" + name);
                String value = (String) m.invoke(this);
                if (value != null) {
//                    if ("body".equalsIgnoreCase(name)) {
//                        string ="\r\n"+string ;
//                    }
                    string += value + "\r\n";
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return string;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
