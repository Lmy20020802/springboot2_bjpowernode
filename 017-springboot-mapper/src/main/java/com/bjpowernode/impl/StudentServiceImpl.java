package com.bjpowernode.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 23:43
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }
}
