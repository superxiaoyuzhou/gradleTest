package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello/{name}")
    public String Hello(@PathVariable String name){
        String url = "http://provider-hello/hello/" + name;
        String str = restTemplate.getForObject(url, String.class);
        return str;
    }
}
