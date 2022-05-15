package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CustomFilterController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 21:30
 **/
@RestController
public class CustomFilterController {

    @RequestMapping("/user/account")
    public String userAccount(){
        return "user/account";
    }

    @RequestMapping("/query")
    public String queryAccount(){
        return "/query";
    }
}
