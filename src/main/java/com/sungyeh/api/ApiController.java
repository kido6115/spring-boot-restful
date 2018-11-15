package com.sungyeh.api;

import com.sungyeh.domain.Hero;
import com.sungyeh.domain.User;
import com.sungyeh.service.HeroService;
import com.sungyeh.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ApiController {
    @Resource
    private HeroService heroService;
    @Resource
    private UserService userService;
    @GetMapping("hero")
    public List<Hero> findAllHeroes() {
        return heroService.findAll();
    }

    @GetMapping("user")
    public List<User> findUsers(){return userService.findAll();}
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
    @GetMapping("chcg")
    public String chcg(){
        BufferedReader br = null;
        FileReader fr = null;
        StringBuilder test= new StringBuilder();
        try {

            fr = new FileReader("src/main/resources/chcg.json");
            br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                test.append(sCurrentLine);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
    return test.toString();
    }
}
