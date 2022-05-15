package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        //获取容器对象
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        //从容器中获取对象
        UserService userService = (UserService) context.getBean("userService");
        userService.sayHello("李四");
    }
}
