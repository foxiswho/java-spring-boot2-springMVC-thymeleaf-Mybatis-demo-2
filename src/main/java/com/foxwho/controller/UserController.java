package com.foxwho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
//    @Autowired
//    private UserDaoMapper userDaoMapper;
//
//    @ResponseBody
//    @PostMapping("/add")
//    public int addUser(UserDaoWithBLOBs user) {
//        return userDaoMapper.insert(user);
//    }
}
