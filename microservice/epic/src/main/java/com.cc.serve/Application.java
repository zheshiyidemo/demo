package com.cc.serve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by hubiao on 2017/4/20.
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String []args){
        SpringApplication.run(Application.class, args);
    }

}
