package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName StudentDao
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/16 23:06
 **/

/**
 * @Mapper:告诉Mybatis这是dao接口 创建此接口的代理对象
 *        位置:在类的上面
 */

public interface SchoolDao {

    Student selectById(@Param("stuId") Integer id);
}
