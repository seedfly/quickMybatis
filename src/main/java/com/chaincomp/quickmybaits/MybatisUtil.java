package com.chaincomp.quickmybaits;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    // 根据配置文件信息创建与数据库的连接，并返回数据库操作对象
    public static SqlSession openSqlSession(){
        String sqlConfigXML = "mybaits-config.xml";
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(sqlConfigXML);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in,"test");
        return build.openSession();
    }
}
