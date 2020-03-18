package com.springmvc.service.impl;

import com.springmvc.dao.UserinfoMapper;
import com.springmvc.entity.Userinfo;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserinfoMapper userinfoMapper;


}
