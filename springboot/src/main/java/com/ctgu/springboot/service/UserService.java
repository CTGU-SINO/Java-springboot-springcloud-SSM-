package com.ctgu.springboot.service;

import com.ctgu.springboot.pojo.User;


public interface UserService {

    /**
     * 根据用户名称，查询用户信息
     * @param username
     */
    User findUserByName(String username);
}
