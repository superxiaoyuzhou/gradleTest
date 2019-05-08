package com.example.testfour.controller;

import com.example.testfour.entity.User;
import com.example.testfour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public String hello() {
        return "hello gradle";
    }

    @RequestMapping("user/find")
    public List<User> find(){
        return userService.find();
    }
}
