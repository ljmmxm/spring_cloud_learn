package com.example.demo.contrloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
}
