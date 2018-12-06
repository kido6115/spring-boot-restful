package com.sungyeh.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FooServiceTest {
    @Resource
    private FooService service;
    @Test
    public void foo(){
        assertThat(service.getStatus(true)).isFalse();
        assertThat(service.getStatus(false)).isTrue();

    }
}
