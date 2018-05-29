package com.example.demo.contrloer;

import com.example.demo.contrloer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@RestController
public class ConsumerControler {
    @Autowired
    private RestTemplate template;
    @RequestMapping("/addUser")
    public String addUser(){
        return template.getForEntity("http://BOOT-PRO/addUser",String.class).getBody();
    }

    @RequestMapping("/findUsers")
    public List<User> findUsers(){
        return template.getForEntity("http://BOOT-PRO/findUsers",List.class).getBody();
    }

    @RequestMapping("/findUser/{id}")
    public User findUser(@PathVariable long id){
        return  template.getForEntity("http://BOOT-PRO/findUser/" + id,User.class).getBody();
    }
}
