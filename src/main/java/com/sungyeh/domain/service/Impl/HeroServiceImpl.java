package com.sungyeh.domain.service.Impl;

import com.sungyeh.domain.Hero;
import com.sungyeh.domain.repository.HeroRepository;
import com.sungyeh.domain.service.HeroService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service("com.sungyeh.domain.service.Impl.HeroServiceImpl")
@Transactional
public class HeroServiceImpl implements HeroService {
    @Resource
    private HeroRepository repository;

    @Override
    public List<Hero> findAll() {
        return repository.findAll();
    }

    @Override
    public Hero findOne(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public Hero create(Hero hero) {
        return repository.save(hero);
    }

    private static final String[] EXCLUDE_PROPERTIES = new String[]{"id"};

    @Override
    public Hero update(Hero hero) {
        Hero target = repository.getOne(hero.getId());
        BeanUtils.copyProperties(hero, target, EXCLUDE_PROPERTIES);
        return repository.save(target);
    }

    @Override
    public Hero delete(Integer id) {
        Hero target = repository.getOne(id);
        if (!Objects.isNull(target)) {
            repository.delete(target);
        }
        return target;
    }
}
