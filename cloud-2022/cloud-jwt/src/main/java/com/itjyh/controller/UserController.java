package com.itjyh.controller;/**
 * @Author: jiayuhang
 * @Date: 2022/10/11/17:19
 * @Description:
 */


import com.itjyh.entity.ControllerRes;
import com.itjyh.entity.ServiceRes;
import com.itjyh.entity.User;
import com.itjyh.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/10/11 17:19
 */
@Slf4j
@RestController
@ResponseBody
@Api(tags = {"用户相关接口"})
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    @ApiOperation(value = "注册")

    public ControllerRes register(User user) {
        // 注册
        ServiceRes serviceRes = userService.register(user);
        return new ControllerRes(serviceRes.getCode(), serviceRes.getMsg());
    }
    @PostMapping("/login")
   @ApiOperation(value = "登录")
    public ControllerRes login(User user, HttpServletResponse response) {
        // 登录
        ServiceRes serviceRes = userService.login(user);

        // 登录成功后往响应头插入jwt
        if(serviceRes.getJwt() != null) response.addHeader("access-token", serviceRes.getJwt());
        return new ControllerRes(serviceRes.getCode(), serviceRes.getMsg());
    }
    @PostMapping("/pwd")
    @ApiOperation(value = "修改密码")
    public ControllerRes changePassWord(User user, HttpServletRequest request) {
        //修改密码
        // 取出jwt中的用户
        User jwtUser = (User)request.getAttribute("jwt-user");
        // 合并jwt中用户的用户名与传入用户的新密码
        // 此处不能直接使用传入的用户名，防止恶意修改其他用户的密码
        user.setId(jwtUser.getId());
        // 改密
        ServiceRes serviceRes = userService.changePassWord(user);
        return new ControllerRes(serviceRes.getCode(), serviceRes.getMsg());
    }
    @PostMapping("/logout")
    @ApiOperation(value = "注销")
    public ControllerRes logout(HttpServletRequest request,HttpServletResponse response, Object handler){
        ServiceRes serviceRes=userService.logout(request, response, handler);
        return new ControllerRes(serviceRes.getCode(),serviceRes.getMsg());
    }
}
