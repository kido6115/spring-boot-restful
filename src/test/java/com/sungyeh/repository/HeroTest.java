package com.sungyeh.repository;

import com.sungyeh.domain.Hero;
import com.sungyeh.service.HeroService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HeroTest {
    @Resource
    private HeroService heroService;
    @Test
    public void test(){
        System.out.println(heroService.findAll());
        Hero hero=heroService.findOne(1);
        hero.setName("test");
        heroService.update(hero);
        heroService.delete(hero.getId());
        Hero target=new Hero();
        heroService.create(target);
    }
}
