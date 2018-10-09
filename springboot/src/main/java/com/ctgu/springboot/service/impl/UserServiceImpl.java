package com.ctgu.springboot.service.impl;

import com.ctgu.springboot.dao.UserDao;
import com.ctgu.springboot.pojo.User;
import com.ctgu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User findUserByName(String username) {
        return userDao.findByName(username);
    }
}
