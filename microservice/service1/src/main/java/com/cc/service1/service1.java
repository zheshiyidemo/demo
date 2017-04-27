package com.cc.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by hubiao on 2017/4/21.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class service1 {
    public static void main(String[] args) {
        SpringApplication.run(service1.class,args);
    }
}
