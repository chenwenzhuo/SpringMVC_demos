package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/","/home"})
    public String homePage(Model model) {
        model.addAttribute("message", "Hello Spring!");
        return "home";
    }
}
