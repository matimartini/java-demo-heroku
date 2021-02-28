package com.demomeli.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongController {

    @GetMapping("/ping")
    public String getPong(){
        return "pong";
    }
}
