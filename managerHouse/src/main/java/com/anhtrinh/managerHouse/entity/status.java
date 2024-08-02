package com.anhtrinh.managerHouse.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "status")
public class status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "status")
    private Set<port> ports;

//    Constructor

    public status() {
    }

    public status(int id, String name, Set<port> ports) {
        this.id = id;
        this.name = name;
        this.ports = ports;
    }

    //    Getter setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<port> getPorts() {
        return ports;
    }

    public void setPorts(Set<port> ports) {
        this.ports = ports;
    }
}
