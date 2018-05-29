package com.example.demo.contrloer;

import com.example.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestControler {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        ServiceInstance instance = client.getLocalServiceInstance();
        return instance.getHost() + "," + instance.getPort() + "," + instance.getServiceId();
    }

    @RequestMapping(value = "findUser",method =RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User findUser(){
        return new User(1,"test","boy");
    }
}
