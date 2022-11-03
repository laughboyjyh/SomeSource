package com.itjyh.configclient;/**
 * @Author: jiayuhang
 * @Date: 2022/09/27/9:14
 * @Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/9/27 9:14
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }
}
