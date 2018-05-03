package com.cn.yunxi.service.ribbon.controller;

import com.cn.yunxi.service.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        System.out.println("测试");
        return helloService.hiService(name);
    }

}
