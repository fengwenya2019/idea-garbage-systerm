package com.springmvc.controller;

import com.springmvc.entity.Msg;
import com.springmvc.entity.Userinfo;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("UserController")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Msg login(@RequestBody Userinfo userinfo) {
        return Msg.success();
    }

}