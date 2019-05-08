package com.example.consumerfeign.controller;

import com.example.consumerfeign.client.EurekaServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private EurekaServiceFeign eurekaServiceFeign;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        String str = eurekaServiceFeign.hello(name);
        return str;
    }

}
