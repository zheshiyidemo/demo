package com.cc.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by hubiao on 2017/4/21.
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class Service {
    public static void main(String[] args) {
        SpringApplication.run(Service.class,args);
    }
}
