package com.example.lawyerwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainPageController {
    @GetMapping("/")
    public String mainPage(){
        return "Lawyer";
    }
    @PostMapping("/send-message")
    public String sendMessage(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("topic") String topic,
            @RequestParam("message") String message,
            Model model){

        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("topic", topic);
        model.addAttribute("message", message);

        return "Lawyer";
    }
}
