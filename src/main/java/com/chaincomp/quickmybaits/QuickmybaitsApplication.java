package com.chaincomp.quickmybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan("com.chaincomp.quickmybaits.mapper")
public class QuickmybaitsApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(QuickmybaitsApplication.class, args);

    }
}

