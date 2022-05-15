package com.bjpowernode.vo;

/**
 * @ClassName Zoo
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/18 17:59
 **/
public class Zoo {

    private  Cat cat;
    private  Dog dog;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
