package com.example.demo.contrloer;

import com.example.demo.contrloer.dao.UserRepository;
import com.example.demo.contrloer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestControler {
    @Autowired
    private UserRepository repository;
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/addUser")
    public String addUser(){
        repository.save(new User("zw",1));
        return "success";
    }

    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        return repository.findAll();
    }

    @RequestMapping("/findUser/{id}")
    public User findUser(@PathVariable long id){
        return repository.findOne(id);
    }
}
