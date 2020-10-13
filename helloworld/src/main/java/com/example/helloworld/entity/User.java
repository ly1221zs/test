package com.example.helloworld.entity;

import lombok.Data;

/**
 * @desc
 * @auther liangyue
 * @date 2020/10/11 23:04
 */
@Data
public class User {
    private Long id;
    private String name;
    private String password;
}
