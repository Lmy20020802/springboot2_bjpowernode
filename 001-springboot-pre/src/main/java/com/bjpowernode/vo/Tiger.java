package com.bjpowernode.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Tiger
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 11:04
 **/
@Component("tiger")
public class Tiger {

    @Value("${tiger.name}")
    private String name;
    @Value("${tiger.age}")
    private Integer age;

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
