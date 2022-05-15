package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/17 22:16
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("data","SpringBoot打包为jar");
        mv.setViewName("main");
        return  mv;
    }
}
