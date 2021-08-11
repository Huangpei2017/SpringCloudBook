package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Copyright (C), 2018-2021
 * @FileName: HelloApplication
 * @Author: Charles
 * @Date: 2021/6/15 20:20
 * @Description: thinking in patterns 【】
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
