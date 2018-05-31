package com.sungyeh.service;

import com.sungyeh.domain.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> findAll();

    Hero findOne(Integer id);

    Hero create(Hero hero);

    Hero update(Hero hero);

    Hero delete(Integer id);

}
