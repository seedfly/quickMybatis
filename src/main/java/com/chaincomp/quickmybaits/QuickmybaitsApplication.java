package com.chaincomp.quickmybaits;

import com.chaincomp.quickmybaits.mapper.SysUserMapper;
import com.chaincomp.quickmybaits.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuickmybaitsApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(QuickmybaitsApplication.class, args);

    }


}

