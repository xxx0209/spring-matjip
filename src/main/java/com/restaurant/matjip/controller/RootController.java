package com.restaurant.matjip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String root() {
        return "redirect:/api/main";
    }

    @GetMapping("/health")
    public String health() {
        return "Start UP";
    }
}

