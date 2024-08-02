package com.anhtrinh.managerHouse.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "role")
public class role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "role")
    private Set<user> users;

//    Constructor

    public role() {
    }

    public role(Set<user> users, String name, int id) {
        this.users = users;
        this.name = name;
        this.id = id;
    }

//    Gettet setter


    public Set<user> getUsers() {
        return users;
    }

    public void setUsers(Set<user> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
