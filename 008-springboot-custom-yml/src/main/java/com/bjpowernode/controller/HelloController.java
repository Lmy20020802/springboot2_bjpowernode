package com.bjpowernode.controller;

import com.bjpowernode.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 15:24
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${school.name}")
    private String name;

    @Value("${site}")
    private String site;

    @Resource
    private SchoolInfo info;

    @RequestMapping("/data")
    public String queryData(){
        return name+",site="+site+",项目访问地址="+contextPath+",使用的端口="+port;
    }

    @RequestMapping("/info")
    public String queryInfo(){
        return "SchoolInfo对象=="+info.toString();
    }
}
