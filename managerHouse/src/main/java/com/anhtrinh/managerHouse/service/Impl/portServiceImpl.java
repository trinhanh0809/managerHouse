package com.anhtrinh.managerHouse.service.Impl;

import com.anhtrinh.managerHouse.entity.port;
import com.anhtrinh.managerHouse.repository.portRepository;
import com.anhtrinh.managerHouse.repository.statusRepository;
import com.anhtrinh.managerHouse.service.portService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class portServiceImpl implements portService {
    @Autowired
    private portRepository portRepository;
    @Autowired
    private statusRepository statusRepository;

    @Override
    public List<port> getAllPort() {
        return portRepository.findAll();
    }

    @Override
    public port getPortById(int id) {
        return portRepository.findById(id).get();
    }

    @Override
    @Transactional
    public port addPort(port port) {
        return portRepository.save(port);
    }

    @Override
    public port updatePort(port port) {
        return portRepository.saveAndFlush(port);
    }

    @Override
    public void deletePortById(int id) {
            portRepository.deleteById(id);
    }

    @Override
    public port approvePort(int id) {
        return null;
    }
}
