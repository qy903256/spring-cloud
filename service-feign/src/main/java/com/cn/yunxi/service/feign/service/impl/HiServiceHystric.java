package com.cn.yunxi.service.feign.service.impl;

import com.cn.yunxi.service.feign.service.IHilService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystric implements IHilService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
