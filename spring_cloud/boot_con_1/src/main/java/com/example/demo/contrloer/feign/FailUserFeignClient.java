package com.example.demo.contrloer.feign;

import com.example.demo.contrloer.model.User;
import org.springframework.stereotype.Component;

@Component
public class FailUserFeignClient implements UserFeignClient{
    @Override
    public User findUser(long id) {
        return new User(-1,"默认事变",-1);
    }
}
