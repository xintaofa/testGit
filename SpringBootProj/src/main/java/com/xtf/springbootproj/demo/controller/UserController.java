package com.xtf.springbootproj.demo.controller;

import com.xtf.springbootproj.demo.model.User;
import com.xtf.springbootproj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String home(){

        String name="xintao";
        String password="123456";

        User user=userService.login(name,password);

        if (user != null && user.getName().equals("xintao")){
            return "xintaofa 登陆！";
        }else{
            return "阮鑫鹏是煞笔！";
        }
    }





}
