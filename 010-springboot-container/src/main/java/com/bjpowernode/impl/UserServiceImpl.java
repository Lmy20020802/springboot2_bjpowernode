package com.bjpowernode.impl;

import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 18:09
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行了业务方法的sayHello"+name);
    }
}
