package com.bjpowernode.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @ClassName MyRestController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/17 11:35
 **/
@RestController
public class MyRestController {

    //学习注解的使用

    //查询id=1001的学生

    /**
     * @PathVariable(路径变量) :获取url中的值
     *             属性: value: 路径变量名
     *             位置: 放在控制器方法的形参前面
     *
     * http://localhost:8080/myboot/student/1002
     *
     * {stuId}:定义路径变量: stuId自定义名称
     */
    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable(value = "stuId") Integer studentId){
        return  "查询学生studentId="+studentId;
    }

    /**
     * 创建资源post请求方式
     *
     * http://localhost:8080/myboot/student/李铭洋/1002
     */

    /***
     * 创建资源 Post请求方式
     * http://localhost:8080/myboot/student/zhangsan/20
     */
    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name,
                                @PathVariable("age") Integer age){
        return "创建资源 student: name="+name+"#age="+age;
    }

    /**
     * 更新资源
     *
     * 当路径变量名称和形参名一样 @PathVariable中的value可以省略
     */

    @PutMapping("/student/{id}/{age}")
    public String modifyStudent(@PathVariable Integer id,
                                @PathVariable Integer age)
    {
        return  "更新资源 执行put请求方式: id="+id+"#age"+age;
    }

    /**
     * 删除资源
     *
     * 当路径变量名称和形参名一样 @PathVariable中的value可以省略
     */

    @DeleteMapping("/student/{id}")
    public String removeStudentById(@PathVariable Integer id)
    {
        return  "删除资源 执行 delete id="+id;
    }

    @PutMapping("/student/test")
    public String test(){
        return  "执行student/test, 使用的请求是put";
    }

    @DeleteMapping("/student/testdelete")
    public String testDelete(){
        return  "执行student/testDelete, 使用的请求是delete";
    }
}
