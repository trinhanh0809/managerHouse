package com.anhtrinh.managerHouse.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "port")
public class port {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "image", nullable = false)
    private String image;
    @Column(name = "title", nullable = false, length = 100)
    private String title;
    @Column(name = "description", nullable = false, length = 150)
    private String description;
    @Column(name = "address", nullable = false, length = 10)
    private String address;
    @Column(name ="status")
    private int status;



//    Constructor
    public port() {}

    public port(String image, String title, String description, String address) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.address = address;
    }

    public port(int id, String image, String title, String description, String address) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
        this.address = address;
    }
//    Getter setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
