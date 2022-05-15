package com.bjpowernode.service.impl;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/17 17:53
 **/

/**
 * 使用dubbo中的注释暴露服务
 */
@Component
@DubboService(interfaceClass = StudentService.class,version = "1.0",timeout = 5000)
public class StudentServiceImpl implements StudentService {

    @Override
    public Student queryStudent(Integer id) {
        Student student=new Student();
        if (1001==id){
            student.setId(1001);
            student.setName("1001-张三");
            student.setAge(20);
        }else if (1002==id){
            student.setId(1002);
            student.setName("1002-李四");
            student.setAge(22);
        }
        return student;
    }
}
