package com.example.helloworld.service.impl;







import com.example.helloworld.dao.UserMapper;
import com.example.helloworld.entity.User;
import com.example.helloworld.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @desc
 * @auther liangyue
 * @date 2020/10/11 23:22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void getInfo() {
        User user = userService.getInfo("zhangsan", "123");
        System.out.println(String.format("用户id: %d",user==null?null:user.getId()));
    }
}