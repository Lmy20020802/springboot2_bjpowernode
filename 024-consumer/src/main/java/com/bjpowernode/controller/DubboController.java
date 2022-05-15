package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DubboController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/17 18:20
 **/
@RestController
public class DubboController {

    /**
     * 引用远程服务 把创建好的代理对象 注入给studentService
     */
    @DubboReference(interfaceClass = StudentService.class,version = "1.0")
    private StudentService studentService;

    @GetMapping("/query")
    public String queryStudent(){
        Student student = studentService.queryStudent(1001);
        return "调用远程接口,获取对象:"+student;
    }
}
