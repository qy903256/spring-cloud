package com.cn.yunxi.service.feign.service;


import com.cn.yunxi.service.feign.service.impl.HiServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = HiServiceHystric.class)
public interface IHilService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
