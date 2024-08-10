package com.anhtrinh.managerHouse.repository;

import com.anhtrinh.managerHouse.entity.status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface statusRepository extends JpaRepository<status, Integer> {
    public status findByName(String name);
}
