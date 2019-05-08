package com.example.testfour.service.Impl;

import com.example.testfour.entity.User;
import com.example.testfour.mapper.UserMapper;
import com.example.testfour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> find() {
        return userMapper.find();
    }

    @Override
    public User get(Integer id) {
        return userMapper.get(id);
    }
}
