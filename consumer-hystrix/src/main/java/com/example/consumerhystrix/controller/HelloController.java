package com.example.consumerhystrix.controller;

import com.example.consumerhystrix.client.EurekaServiceFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private EurekaServiceFeign eurekaServiceFeign;

    @RequestMapping("/hello/{name}")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(@PathVariable String name){
        String str = eurekaServiceFeign.hello(name);
        return str;
    }

    public String helloFallback(String name){
        return "helloFallback:" + name;
    }
}
