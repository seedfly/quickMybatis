package com.chaincomp.quickmybaits;

import com.chaincomp.quickmybaits.mapper.SysUserMapper;
import com.chaincomp.quickmybaits.model.SysUser;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String args[]){
        System.out.println("start");
        run();
    }

    private static void run() {
        try {
            // 连接数据库，并得到数据库操作对象
            SqlSession openSession = MybatisUtil.openSqlSession();

            SysUserMapper mapper=openSession.getMapper(SysUserMapper.class);

            // 得到mapper对象（该对象在mybatis-config.xml中要配置正确）
            // 然后调用方法执行封装的sql语句
            SysUser user=new SysUser();
            user.setAge(14);
            user.setGender("Male");
            user.setId(1);
            user.setName("Jack");
            mapper.insert(user);
            openSession.commit();
            // 最后关闭连接
            openSession.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

