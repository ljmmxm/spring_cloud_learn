package com.example.demo.contrloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    private Book book;

    @RequestMapping("/")
    public String test(){
        return book.getName() + "." + book.getPort() + "," + book.getDesc() + "," + book.getrStr()
                + "," + book.getrInt() + "," + book.getrIntRange();
    }
}
