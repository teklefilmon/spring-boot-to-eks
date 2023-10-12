package com.eritours.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/v1/greetings")
    public String greeting() {
        return "Shalom";
    }
}
