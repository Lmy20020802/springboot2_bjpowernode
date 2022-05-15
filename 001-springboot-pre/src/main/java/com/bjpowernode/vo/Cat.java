package com.bjpowernode.vo;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 10:49
 **/
public class Cat {

    private String cardId;
    private String name;
    private Integer age;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
