package com.example.demo.contrloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestControler {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer", method = RequestMethod.GET)
    public String hello(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }
}
