package com.bjpowernode.impl;

import com.bjpowernode.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @ClassName HelloServiceImpl
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 18:30
 **/
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好:"+name;
    }
}
