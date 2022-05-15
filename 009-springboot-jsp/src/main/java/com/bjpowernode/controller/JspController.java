package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName JspController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 17:41
 **/
@Controller
public class JspController {

    //试图的逻辑名称
//    public String doJsp(HttpServletRequest request){
//        request.setAttribute("data","SpringBoot使用Jsp");
//        //视图的逻辑名称
//        return "index";
//    }

    /**
     * ModelAndView:
     * @param model
     * @return
     */
    //试图的逻辑名称
    @RequestMapping("/myjsp")
    public String doJsp(Model model){

        //把数据放入到request作用域
        model.addAttribute("data","SpringBoot使用Jsp");
        //request.setAttribute("data","SpringBoot使用Jsp");

        //视图的逻辑名称
        return "index";
    }
}
