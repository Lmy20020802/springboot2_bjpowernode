package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BootController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 14:03
 **/
@RestController
public class BootController {

    @RequestMapping("/hello")
    public String doSome(){
        return "SpringBoot多环境配置";
    }
}
