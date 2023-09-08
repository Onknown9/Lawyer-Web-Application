package com.example.lawyerwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @GetMapping("/lawyer")
    public String mainPage(){
        return "Lawyer";
    }
}
