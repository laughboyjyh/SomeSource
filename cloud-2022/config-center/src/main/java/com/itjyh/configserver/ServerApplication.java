package com.itjyh.configserver;/**
 * @Author: jiayuhang
 * @Date: 2022/09/27/10:57
 * @Description:
 */

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yuhang
 * @version 1.0
 * @description: TODO
 * @date 2022/9/27 10:57
 */
@SpringBootApplication
@EnableConfigServer
@Data
public class ServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);

    }


}
