package com.cc.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hubiao on 2017/4/21.
 */
@RestController
@RefreshScope
public class ServiceController{

    @Value("${demos}")
    public String demos;

    @GetMapping("/time")
    String GetDate(){
        return "#####################"+demos+"####################";
    }

    @RequestMapping("/test0")
    String test(){
        return "测试网关";
    }
}
