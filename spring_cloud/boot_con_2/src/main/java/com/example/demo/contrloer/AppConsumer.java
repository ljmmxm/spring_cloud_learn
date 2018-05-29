package com.example.demo.contrloer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class AppConsumer {
    @Bean
    @LoadBalanced
    RestTemplate template(){
        return  new RestTemplate();
    }
    public static void main(String[] args){
        SpringApplication.run(AppConsumer.class,args);
    }
}
