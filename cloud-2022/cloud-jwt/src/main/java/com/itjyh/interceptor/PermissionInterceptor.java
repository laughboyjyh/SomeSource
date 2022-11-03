package com.itjyh.interceptor;/**
 * @Author: jiayuhang
 * @Date: 2022/10/11/17:20
 * @Description:
 */

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.itjyh.entity.ControllerRes;
import com.itjyh.entity.User;
import com.itjyh.utils.JwtUtil;
import com.itjyh.utils.RedisCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/10/11 17:20
 */
@Slf4j

public class PermissionInterceptor implements HandlerInterceptor {

    // 目标方法执行前调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {

        // 检查用户JWT
        String jwt = request.getHeader("access-token");            // System.out.println("jwt的值:"+jwt);

        // token 解码
        DecodedJWT dj = JwtUtil.decodeToken(jwt);
        // 取出用户信息id
        String userId = dj.getClaim("userId").asString();
        //查看jwt续签次数
        int jwtTime= Integer.parseInt(dj.getClaim("limitTime").asString());

        // 比对redis值
        ValueOperations<String, Object> operations = RedisCache.redis.opsForValue();
        String value = (String) operations.get("login:" + userId);     // System.out.println("value:"+value);
        //jwt黑名单,redis中jwt和请求头的jwt一致,则返回false,强制注销
        if (jwt.equals(value)) {
            log.error("该用户已注销,需要重新登录");
            addResBody(response, new ControllerRes(-1, "该用户已注销,请重新登录"));  // 新增返回体
            return false;
        }
        //续签次数判断.登录时生成为0,限制续签3次,第4次续签时返回false,强制注销
        if (jwtTime>3){
            log.error("该用户已续签3次,需要重新登录");
            addResBody(response, new ControllerRes(-1, "该用户已续签3次,请重新登录"));  // 新增返回体
            return false;

        }


        // 校验并取出私有信息
        try {


            /* 已取出
            // token 解码
            DecodedJWT dj = JwtUtil.decodeToken(jwt);
            //取出基本用户信息加入请求
            String userId = dj.getClaim("userId").asString();
            */

            String userName = dj.getClaim("userName").asString();

            // jwt校验合格的，将 jwt 中存的用户信息加入请求头，不合格的，请求头存个空用户
            request.setAttribute("jwt-user", userId != null ? new User(Integer.valueOf(userId), userName) : new User());


            // 计算当前时间是否超过过期时间的一半，如果是就帮用户续签
            // 此处并不是永久续签，只是为 大于过期时间的一半 且 小于过期时间 的 token 续签
            Long expTime = dj.getExpiresAt().getTime();
            Long iatTime = dj.getIssuedAt().getTime();
            Long nowTime = new Date().getTime();


            if ((nowTime - iatTime) > (expTime - iatTime) / 2) {

                String limitTime = String.valueOf( Integer.parseInt(dj.getClaim("limitTime").asString())+1);
                // 生成新的jwt
                Map<String, String> payload = new HashMap<>();
                payload.put("userId", userId); // 加入一些非敏感的用户信息
                payload.put("userName", userName);    // 加入一些非敏感的用户信息
                payload.put("limitTime", limitTime);
                String newJwt = JwtUtil.generateToken(payload);
                // 加入返回头
                response.addHeader("access-token", newJwt);
            }
            return true;


        } catch (JWTDecodeException e) {
            log.error("令牌错误");
            addResBody(response, new ControllerRes(-1, "令牌错误"));  // 新增返回体
            return false;

        } catch (TokenExpiredException e) {
            log.error("令牌过期");
            addResBody(response, new ControllerRes(-1, "令牌过期"));  // 新增返回体
            return false;
        }


    }


    // 目标方法执行后调用
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    // 页面渲染前调用
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

    private void addResBody(HttpServletResponse response, ControllerRes res) throws IOException {

        response.setStatus(HttpServletResponse.SC_FORBIDDEN);        // 设置状态码

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.write(JSONObject.toJSONString(res));
        out.flush();
        out.close();

    }

}


