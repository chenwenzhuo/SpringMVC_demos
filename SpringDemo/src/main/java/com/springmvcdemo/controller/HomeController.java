package com.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/", "/home", "/index"})
    public String homePage(Model model) {
        model.addAttribute("message", "Hello,spring!");
        return "index";
    }
}
