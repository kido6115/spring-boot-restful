package com.sungyeh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AngularController{

    @RequestMapping("/admin/**")
    public String forward(){
        return "forward:/index.html";
    }

}
