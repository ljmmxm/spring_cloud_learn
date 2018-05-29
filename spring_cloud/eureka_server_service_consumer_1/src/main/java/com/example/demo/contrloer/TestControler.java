package com.example.demo.contrloer;

import com.example.demo.vo.User;
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
    public String consumer(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }

    @RequestMapping(value="/consumerUser", method = RequestMethod.GET)
    public User user(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/findUser",User.class).getBody();
    }
}
