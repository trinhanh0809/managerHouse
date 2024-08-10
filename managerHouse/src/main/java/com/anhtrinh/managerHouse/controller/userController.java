package com.anhtrinh.managerHouse.controller;

import com.anhtrinh.managerHouse.entity.user;
import com.anhtrinh.managerHouse.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService userService;

//    @PostMapping("/register")
//    public String register(@RequestBody user user) {
//
//    }

}
