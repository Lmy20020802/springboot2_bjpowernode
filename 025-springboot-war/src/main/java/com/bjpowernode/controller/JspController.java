package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName JspController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/17 21:32
 **/
@Controller
public class JspController {

    @RequestMapping("/main")
    public String main(Model model){
        model.addAttribute("data","SpringBoot打包为war文件");
        return "index";
    }
}
