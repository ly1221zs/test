package com.example.helloworld.service.impl;

import com.example.helloworld.dao.UserMapper;
import com.example.helloworld.entity.User;
import com.example.helloworld.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @desc
 * @auther liangyue
 * @date 2020/10/11 23:18
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getInfo(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
