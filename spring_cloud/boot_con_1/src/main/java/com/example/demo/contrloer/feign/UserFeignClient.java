package com.example.demo.contrloer.feign;

import com.example.demo.contrloer.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "BOOT-PRO",fallback = FailUserFeignClient.class)
public interface UserFeignClient {
    @RequestMapping("/findUser/{id}")
    public User findUser(@PathVariable("id")long id);
}
