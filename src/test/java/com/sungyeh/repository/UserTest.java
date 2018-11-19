package com.sungyeh.repository;

import com.sungyeh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserTest {
    @Resource
    private UserService userService;
    @Test
    public void test(){
        System.out.println(userService.findAll());
    }
}
