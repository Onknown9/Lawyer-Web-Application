package com.example.lawyerwebapp.controllers;

import com.example.lawyerwebapp.models.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainPageController {

    @Autowired
    private EmailSenderService senderService;
    @GetMapping("/")
    public String mainPage(){
        return "Lawyer";
    }
    @PostMapping("/")
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

        String messageText = "From: "+name+", E-Mail: "+email+"\n Message: "+message;

        sendMail(topic , messageText);

        return "Lawyer";
    }
    public void sendMail(String subject, String body){
        senderService.sendEmail("lmaosaurus9897@gmail.com",subject,body);
    }
}
