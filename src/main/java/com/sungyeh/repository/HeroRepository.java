package com.sungyeh.repository;

import com.sungyeh.domain.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Integer> {

}
