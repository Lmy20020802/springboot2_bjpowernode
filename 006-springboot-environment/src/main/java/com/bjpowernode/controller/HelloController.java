package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 12:55
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String doSome(){
        return "hello Springboot应用";
    }
}
