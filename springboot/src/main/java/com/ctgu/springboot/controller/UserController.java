package com.ctgu.springboot.controller;

import com.ctgu.springboot.pojo.User;
import com.ctgu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("/")
//    public Map<String, String> index(){
//        Map map = new HashMap<String, String>();
//        map.put("a","1");
//        map.put("b","2");
//        return map;
//    }

    @GetMapping("/getUserInfo")
    public User getUser(@RequestParam(value = "username", required = true) String username) {
        return userService.findUserByName(username);
    }
}
