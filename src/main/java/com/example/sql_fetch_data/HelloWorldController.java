package com.example.sql_fetch_data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/users")
    public UserModel createUser(@RequestBody UserModel user) {
        return userRepository.save(user);
    }
    @GetMapping("/")
    public String helloWorldv(){
        return "hello world!!";
    }
}
