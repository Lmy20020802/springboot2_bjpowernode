package com.bjpowernode;

import com.bjpowernode.config.SpringConfig;
import com.bjpowernode.vo.Cat;
import com.bjpowernode.vo.Student;
import com.bjpowernode.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 10:19
 **/
public class MyTest {
    /**
     * 使用xml作为容器配置文件
     */

    @Test
    public void test01(){
        String config="beans.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(config);
        Student student =(Student) context.getBean("myStudent");
        System.out.println("容器中的对象:"+student);
    }

    /**
     * 使用JavaConfig
     */
    @Test
    public void test02(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student =(Student) context.getBean("createStudent");
        System.out.println("使用JavaConfig创建的对象:"+student);
    }

    @Test
    public void test03(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student =(Student) context.getBean("wsf");
        System.out.println("使用JavaConfig创建的对象:"+student);
    }

    @Test
    public void test04(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) context.getBean("myCat");
        System.out.println("Cat=="+cat);
    }

    @Test
    public void test05(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger=(Tiger) context.getBean("tiger");
        System.out.println("tiger=="+tiger);
    }
}
