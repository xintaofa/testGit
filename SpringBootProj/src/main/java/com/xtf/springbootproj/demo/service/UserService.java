package com.xtf.springbootproj.demo.service;

import com.xtf.springbootproj.demo.mapper.UserDao;
import com.xtf.springbootproj.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User login(String name,String password){
        return userDao.login(name,password).get(0);
    }
}
