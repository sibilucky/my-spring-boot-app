// src/main/java/com/example/demo/DemoApplication.java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // Print the message "Hi, I am Sibi"
        System.out.println("Hi, I am Sibi");
        
        // Run the Spring Boot application
        SpringApplication.run(DemoApplication.class, args);
    }
}
