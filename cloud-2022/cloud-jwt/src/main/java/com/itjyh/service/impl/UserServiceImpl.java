package com.itjyh.service.impl;/**
 * @Author: jiayuhang
 * @Date: 2022/10/11/17:21
 * @Description:
 */

import com.auth0.jwt.interfaces.DecodedJWT;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itjyh.entity.ServiceRes;
import com.itjyh.entity.User;
import com.itjyh.mapper.UserMapper;
import com.itjyh.service.UserService;
import com.itjyh.utils.JwtUtil;
import com.itjyh.utils.RedisCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/10/11 17:21
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisCache redisCache;
    /**
     * 注册
     * @param
     * @return ServiceRes
     */
    @Override
    public ServiceRes register(User user) {
        // 判断用户名是否唯一
        if(this.checkUserNameIsUnique(user)) {
            // 判断用户名密码是否合法
            if(this.checkUserNameAndPassword(user)) {
                // 密码MD5加密
                user.setPassWord(this.MD5Code(user.getPassWord()));
                // 加入创建时间
                user.setCreateTime(new Date());
                // 入库
                userMapper.insert(user);
                return new ServiceRes(1, "注册成功");
            } else return new ServiceRes(-1, "用户名或密码不合法");
        } else return new ServiceRes(-1, "用户名已存在");
    }
    /**
     * 登录
     * @param
     * @return ServiceRes
     */
    @Override
    public ServiceRes login(User user) {
        // 判断用户名密码是否合法
        if(this.checkUserNameAndPassword(user)) {
            // 密码MD5加密
            user.setPassWord(this.MD5Code(user.getPassWord()));
            // 检查用户是否存在
            User curUser = this.checkUserIsExit(user);
            if(curUser!=null) {
                // 更新用户最后登录时间
                curUser.setLastLogin(new Date());
                userMapper.updateById(curUser);
                // 生成jwt
                Map<String, String> payload = new HashMap<>();
                payload.put("userId", curUser.getId().toString()); // 加入一些非敏感的用户信息
                payload.put("userName", curUser.getUserName());    // 加入一些非敏感的用户信息
                payload.put("limitTime","0");                      //加入限制续签次数统计字段
                String jwt = JwtUtil.generateToken(payload);
                return new ServiceRes(1, "登录成功", jwt);
            } else return new ServiceRes(-1, "用户名或密码错误");
        } else return new ServiceRes(-1, "用户名或密码不合法");
    }
    /**
     * 改密业务
     * @return ServiceRes
     */
    @Override
    public ServiceRes changePassWord(User user) {
        if(this.updatePassWord(user)) return new ServiceRes(1, "改密成功");
        else return new ServiceRes(-1, "改密失败");
    }

    @Override
    public ServiceRes logout(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String jwt = request.getHeader("access-token");
        // token 解码
        DecodedJWT dj = JwtUtil.decodeToken(jwt);
        // 取出基本用户信息加入请求头 --------------------------------------------------------------------------------
        String userId = dj.getClaim("userId").asString();
        redisCache.setCacheObject("login:"+userId,jwt);
        //jwt的过期时间为1min,存入redis中设置过期时间为10分钟,自动删除,节约内存
        redisCache.expire("login:"+userId,10, TimeUnit.MINUTES);
        return new ServiceRes(1, "注销成功");
    }

    /**
     * 非对称加密
     * @param text 明文
     * @return 密文
     */
    private String MD5Code(String text) {
        return DigestUtils.md5DigestAsHex(text.getBytes(StandardCharsets.UTF_8));
    }
    /**
     * 修改密码方法
     * @param user 传入用户名和新密码
     * @return 改密成功返回 true 失败返回 false
     */
    private Boolean updatePassWord(User user) {
        // 密码非对称加密
        user.setPassWord(this.MD5Code(user.getPassWord()));
        // 更新密码
        return userMapper.updateById(user)>0;
    }
    /**
     * 检查用户是否存在【用户名密码相同】
     * @param user 用户类
     * @return 用户存在返回 用户对象 不存在返回 null
     */
    private User checkUserIsExit(User user) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.eq(User::getUserName, user.getUserName());
        lqw.eq(User::getPassWord, user.getPassWord());
        return userMapper.selectOne(lqw);
    }
    /**
     * 判断用户名是否唯一
     * @param user 用户类
     * @return 唯一返回 true 不唯一返回 false
     */
    private Boolean checkUserNameIsUnique(User user) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.eq(User::getUserName, user.getUserName());
        List<User> userList = userMapper.selectList(lqw);
        return userList.size() == 0;
    }
    /**
     * 判断用户名密码是否合法
     * @param user 用户类
     * @return 满足 【英文字母、数字、下划线】 返回 true，否则返回 false
     */
    private Boolean checkUserNameAndPassword(User user) {
        String regex = "^[_a-z0-9A-Z]+$";
        return user.getUserName().matches(regex) && user.getPassWord().matches(regex);
    }




}
