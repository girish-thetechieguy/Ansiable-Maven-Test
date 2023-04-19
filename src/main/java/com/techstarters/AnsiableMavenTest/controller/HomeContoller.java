package com.techstarters.AnsiableMavenTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {
    @RequestMapping("/home")
    public String homepage(){
        return "index";
    }
}
