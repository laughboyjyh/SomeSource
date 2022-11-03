package com.itjyh.config;/**
 * @Author: jiayuhang
 * @Date: 2022/10/11/17:19
 * @Description:
 */

//import com.itjyh.interceptor.BlackBandInterceptor;

import com.itjyh.interceptor.PermissionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/10/11 17:19
 */
@Configuration
public class PermissionWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PermissionInterceptor())
                .addPathPatterns("/**")    // 拦截哪些页面
                .excludePathPatterns("/user/login", "/user/register", "/doc.html", "/doc**",
                        "/swagger-ui/**", "/swagger-resources/**", "/swagger-ui.**", "/webjars/**",
                        "/doc.html", "/css/", "/doc.html",
                        "/swagger-resources/",
                        "/v2/api-docs/**",
                        "/favicon.ico",
                        "/v3/api-docs"
                );   // 放行哪些页面
    }
}