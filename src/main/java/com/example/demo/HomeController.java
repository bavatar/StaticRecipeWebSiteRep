package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/list")
    public String listPage(){
        return "list";
    }

    @RequestMapping("/fruity-delicious")
    public String listFruity(){
        return "fruity-delicious";
    }
}
