package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 12:21
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloSpringBoot(){
        return "欢迎使用Springboot框架";
    }
}
