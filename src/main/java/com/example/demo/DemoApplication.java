 package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        // Adding a message to the model, which will be passed to the Thymeleaf template
        model.addAttribute("message", "Hello, Welcome to My Spring Boot App!");
        return "index"; // This corresponds to src/main/resources/templates/index.html
    }
}
