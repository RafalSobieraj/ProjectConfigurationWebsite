package com.example.strona.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String homePage(){
        return "index";
    }

    @GetMapping("/login")
    public String adminLoginPage(){
        return "login";
    }

}
