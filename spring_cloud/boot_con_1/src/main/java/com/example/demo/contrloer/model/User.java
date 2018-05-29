package com.example.demo.contrloer.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String username;
    @Column
    private int age;

    public User() {
    }

    public User(long id) {
        this.id = id;
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public User(long id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
