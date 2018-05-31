package com.sungyeh.api;

import com.sungyeh.domain.Hero;
import com.sungyeh.service.HeroService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ApiController {
    @Resource
    private HeroService heroService;

    @GetMapping("hero")
    public List<Hero> findAllHeroes() {
        return heroService.findAll();
    }

    @GetMapping("hero/{id}")
    public Hero findAllHero(@PathVariable("id") Integer id) {
        return heroService.findOne(id);
    }

    @PostMapping("hero")
    public Hero createHero(@RequestBody Hero hero) {
        return heroService.create(hero);
    }

    @PatchMapping("hero")
    public Hero update(@RequestBody Hero hero) {
        return heroService.update(hero);
    }

    @DeleteMapping("hero/{id}")
    public Hero delete(@PathVariable("id") Integer id) {
        return heroService.delete(id);
    }
}
