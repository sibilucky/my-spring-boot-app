// src/main/java/com/example/demo/HomeController.java
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Return the name of the view or static HTML page to be rendered
        return "index"; // Ensure you have a corresponding index.html in resources/static or resources/templates
    }
}


