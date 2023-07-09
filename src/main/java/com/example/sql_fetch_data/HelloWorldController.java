package com.example.sql_fetch_data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    private final UserRepository userRepository;

    public HelloWorldController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("user", new User());
        return "users";
    }

    @PostMapping("/users")
    public String createUser(User user) {
        userRepository.save(user);
        return "redirect:/users";
    }
    @GetMapping("/")
    public String helloWorldv(){
        return "hello world!!";
    }
}
