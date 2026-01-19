package com.restaurant.matjip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot is runningss";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}