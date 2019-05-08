package com.example.propertiessources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@PropertySource(value = "config/config-bankplus-dev.properties")
public class helloController {
    @Value("${md5Key}")
    private String md5Key1;
    @Autowired
    private Environment env;
    @RequestMapping("hello")
    public String hello(){
        System.out.println(env.getProperty("md5Key"));
        return md5Key1;
    }
}
