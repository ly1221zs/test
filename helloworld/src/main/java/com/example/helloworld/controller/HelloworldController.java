package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc
 * @auther liangyue
 * @date 2020/10/11 22:50
 */
@Controller
public class HelloworldController {
    @RequestMapping("/hellow")
    public  String sayHellow(){
        return "hellow";
    }
}
