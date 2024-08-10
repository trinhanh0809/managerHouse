package com.anhtrinh.managerHouse.repository;

import com.anhtrinh.managerHouse.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<user, Integer> {
    user findByUsername(String username);
    user findByEmail(String email);
    Optional <user> findOneByUsername(String username);
}
