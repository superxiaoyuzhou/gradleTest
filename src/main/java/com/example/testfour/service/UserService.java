package com.example.testfour.service;

import com.example.testfour.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> find();
    User get(Integer id);
}
