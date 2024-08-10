package com.anhtrinh.managerHouse.service.Impl;

import com.anhtrinh.managerHouse.entity.user;
import com.anhtrinh.managerHouse.repository.userRepository;
import com.anhtrinh.managerHouse.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepository;



    @Override
    public void save(user user) {
            userRepository.save(user);
    }

    @Override
    public user findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }


}
