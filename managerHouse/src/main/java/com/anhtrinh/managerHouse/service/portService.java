package com.anhtrinh.managerHouse.service;

import com.anhtrinh.managerHouse.entity.port;

import java.util.List;

public interface portService {
   public List<port> getAllPort();
    public port getPortById(int id);
    public port addPort(port port);
    public port updatePort(port port);
    public void deletePortById(int id);
    public port approvePort(int id);
}
