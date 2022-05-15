package com.bjpowernode.config;

import com.bjpowernode.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @ClassName WebSystemConfig
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 21:47
 **/
@RestController
public class WebSystemConfig {

    //注册Servlet
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        MyServlet myServlet = new MyServlet();
        ServletRegistrationBean reg = new ServletRegistrationBean(myServlet, "/myservlet");
        return reg;
    }
}
