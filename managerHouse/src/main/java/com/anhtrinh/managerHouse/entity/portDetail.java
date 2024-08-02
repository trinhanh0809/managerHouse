package com.anhtrinh.managerHouse.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "port_detail")
public class portDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title",length = 100)
    private String title;
    @Column(length = 100, name = "address")
    private String address;
    @Column(length = 100,name = "phone", nullable = false)
    private String phone;
    @Column(name = "description",length = 150)
    private String description;
    @Column(length = 100, name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "port_id", referencedColumnName = "id")
    private port port;

}
