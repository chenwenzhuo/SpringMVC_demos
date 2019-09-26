package com.springmvcdemo.service;

import com.springmvcdemo.mapper.UserMapper;
import com.springmvcdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findById(int userId) {
        return userMapper.findById(userId);
    }
}
