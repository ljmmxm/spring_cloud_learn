package com.example.demo.contrloer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("${book.name}")
    private String name;
    @Value("${server.port}")
    private int port;
    @Value("${book.desc}")
    private String desc;
    @Value("${book.rInt}")
    private int rInt;
    @Value("${book.rStr}")
    private String rStr;
    @Value("${book.rIntRange}")
    private int rIntRange;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getrInt() {
        return rInt;
    }

    public void setrInt(int rInt) {
        this.rInt = rInt;
    }

    public String getrStr() {
        return rStr;
    }

    public void setrStr(String rStr) {
        this.rStr = rStr;
    }

    public int getrIntRange() {
        return rIntRange;
    }

    public void setrIntRange(int rIntRange) {
        this.rIntRange = rIntRange;
    }
}
