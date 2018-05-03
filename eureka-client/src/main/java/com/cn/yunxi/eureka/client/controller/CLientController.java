package com.cn.yunxi.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CLientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        System.out.println("测试client访问");
        return "hi "+name+",i---------------------------------------am from port:" +port;
    }
}
