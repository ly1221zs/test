package com.example.helloworld.controller;

import com.example.helloworld.entity.User;
import com.example.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Objects;

/**
 * @desc
 * @auther liangyue
 * @date 2020/10/11 23:36
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(String name,String password){
        User user = userService.getInfo(name, password);
        if(Objects.nonNull(user)){
            return  "success";
        }else {
            return "error";
        }
    }
}
