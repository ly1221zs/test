package com.example.helloworld.dao;

import com.example.helloworld.entity.User;

/**
 * @desc
 * @auther liangyue
 * @date 2020/10/11 23:09
 */
public interface UserMapper {
   User getInfo(String name, String password);
}
