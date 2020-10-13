package com.example.helloworld.service;

import com.example.helloworld.entity.User;

/**
 * @desc
 * @auther liangyue
 * @date 2020/10/11 23:17
 */
public interface UserService {
    User getInfo(String name, String password);
}
