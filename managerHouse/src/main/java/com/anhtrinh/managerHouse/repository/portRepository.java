package com.anhtrinh.managerHouse.repository;

import com.anhtrinh.managerHouse.entity.port;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface portRepository extends JpaRepository<port, Integer> {

}
