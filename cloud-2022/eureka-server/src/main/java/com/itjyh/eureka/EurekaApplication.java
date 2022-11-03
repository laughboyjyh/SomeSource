package com.itjyh.eureka;/**
 * @Author: jiayuhang
 * @Date: 2022/09/24/10:37
 * @Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/9/24 10:37
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }

}
