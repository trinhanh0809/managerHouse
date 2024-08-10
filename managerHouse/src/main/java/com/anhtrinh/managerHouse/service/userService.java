package com.anhtrinh.managerHouse.service;

import com.anhtrinh.managerHouse.entity.user;

public interface userService {
    public void save(user user);
    public user findByUserName(String userName);
}
