package com.bjpowernode.config;

import com.bjpowernode.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

/**
 * @ClassName WebApplictionConfig
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 20:37
 **/
@Configuration
public class WebApplictionConfig {

    //定义方式 注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){

        //第一个参数是Servlet对象 第二个是url地址
//        ServletRegistrationBean bean=new ServletRegistrationBean(new MyServlet(),"/myservlet");
//        return bean;

        ServletRegistrationBean bean=new ServletRegistrationBean();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login","/test"); //<url-pattern>
        return  bean;
    }
}
