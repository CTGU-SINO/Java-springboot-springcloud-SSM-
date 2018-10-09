package com.ctgu.spring.annotation.controller;

import com.ctgu.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void execute(){
        System.out.println("UserController exe...");
        userService.add();
    }
}
