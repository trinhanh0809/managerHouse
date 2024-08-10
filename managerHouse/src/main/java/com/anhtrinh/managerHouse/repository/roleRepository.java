package com.anhtrinh.managerHouse.repository;

import com.anhtrinh.managerHouse.entity.role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roleRepository extends JpaRepository<role,Integer> {
    public role findByname(String name);
}
