package com.bjpowernode.vo;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/18 17:59
 **/
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
