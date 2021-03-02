package com.example.herokudemo.controller;

import com.example.herokudemo.domain.Users;
import com.example.herokudemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }

    @GetMapping("/mongo")
    public List<Users> getMongoDb() {

        List<Users> users = userRepository.findAll();

        System.out.println(users);

        return users;
    }
}
