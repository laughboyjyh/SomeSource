package com.itjyh.service;/**
 * @Author: jiayuhang
 * @Date: 2022/10/11/17:21
 * @Description:
 */


import com.itjyh.entity.ServiceRes;
import com.itjyh.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/10/11 17:21
 */
public interface UserService {
    // 注册
    ServiceRes register(User user);
    // 登录
    ServiceRes login(User user);
    // 改密【用于状态续签测试】
    ServiceRes changePassWord(User user);
    // 注销
    ServiceRes logout(HttpServletRequest request, HttpServletResponse response, Object handler);
}