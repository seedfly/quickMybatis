package com.chaincomp.quickmybaits;

import com.chaincomp.quickmybaits.mapper.SysUserMapper;
import com.chaincomp.quickmybaits.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickmybaitsApplicationTests {

    @Autowired
    SysUserMapper mapper;

    @Test
    public void contextLoads() {
        SysUser sysUser = new SysUser();
        sysUser.setAge(15);
        sysUser.setGender("male");

        sysUser.setId(12);
        mapper.insert(sysUser);

        System.out.println(mapper);

        Object o = mapper.findAllUsers();
        System.out.println(o);
    }

}

