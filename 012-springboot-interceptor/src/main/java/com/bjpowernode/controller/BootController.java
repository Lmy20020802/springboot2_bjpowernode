package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BootController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 19:16
 **/
@RestController
public class BootController {

    @RequestMapping("/user/account")
    public String userAccount(){
        return "访问user/account地址";
    }

    @RequestMapping("/user/login")
    public String userLogin(){
        return "访问user/login地址";
    }
}
