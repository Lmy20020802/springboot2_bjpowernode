package com.bjpowernode.web;


import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName MyFilter
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 21:22
 **/
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了MyFilter,doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
