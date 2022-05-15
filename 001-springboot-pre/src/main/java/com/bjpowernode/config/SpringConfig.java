package com.bjpowernode.config;

import com.bjpowernode.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @ClassName SpringConfig
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 10:26
 **/

/**
 *@Configuration:表示当前类作为配置文件使用的,就是用来配置容器的
 *       位置在类的上面
 *
 *       SpringConfig这个类就相当于beans.xml
 */
@Configuration
@ImportResource(value = {"classpath:applicationContext.xml","classpath:beans.xml"})
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "com.bjpowernode.vo")
public class SpringConfig {

    /**
     * 创建方法, 方法的返回值是对象. 在方法的上面加入@Bean
     * 方法的返回值对象注入到容器中
     *
     * @Bean:把对象注册到spring中,作用相当于<bean></bean>
     *
     *     位置:方法的上面
     *
     *     说明:@Bean 不指定对象的名称 默认方法名是id
     */
    @Bean
    public Student createStudent(){
        Student s1=new Student();
        s1.setName("王婷婷");
        s1.setAge(19);
        s1.setSex("女");
        return s1;
    }

    /**
     * 指定对象在容器中的名称(指定<bean>的id属性
     * @Bean的name属性 指定对象的名称(id)
     */

    @Bean(name = "wsf")
    public Student makeStudent(){
        Student s2=new Student();
        s2.setName("王思菲");
        s2.setAge(18);
        s2.setSex("女");
        return s2;
    }
}
