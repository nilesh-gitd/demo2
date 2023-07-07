package com.example.sql_fetch_data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {
    private final UserRepository userRepository;

    public HelloWorldController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/")
    public String helloWorld(){
        return "hello world!!";
    }
}
