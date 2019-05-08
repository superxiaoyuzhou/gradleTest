package com.example.testfour.mapper;

import com.example.testfour.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //调用xml方式
    public List<User> find();

    //调用注解方式
    @Select("select * from user where id=#{id}")
    public User get(@Param("id") Integer id);

}
