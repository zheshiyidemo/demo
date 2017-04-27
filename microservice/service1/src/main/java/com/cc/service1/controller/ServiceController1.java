package com.cc.service1.controller;

import com.cc.service1.client.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hubiao on 2017/4/21.
 */
@RestController
public class ServiceController1 {

    @Autowired
    ServiceClient ServiceClient;

    @GetMapping("/test/")
    public void GetDemo(){
        System.out.print(ServiceClient.GetDate());
    }
}
