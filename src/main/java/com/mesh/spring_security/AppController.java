package com.mesh.spring_security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class AppController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    public String homePage(){
        return "index";
    }
    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/success")
    public String registration(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded = encoder.encode(user.getPassword());
        user.setPassword(encoded);
        userRepository.save(user);
        return "success";
    }
    @GetMapping("/users")
    public String viewList(Model model){
        List<User> listUsers = userRepository.findAll();
        model.addAttribute("listUsers",listUsers);
        return "users";
    }
}
