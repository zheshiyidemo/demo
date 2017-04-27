package com.cc.service1.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hubiao on 2017/4/21.
 * 调用service服务
 */
//
@FeignClient("demo-server")
public interface ServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/time")
    String GetDate();
}
