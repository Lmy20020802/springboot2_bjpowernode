package com.bjpowernode.vo;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/18 17:58
 **/
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
