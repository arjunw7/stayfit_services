package com.stayfit.services.controller;

import com.stayfit.services.domain.User;
import com.stayfit.services.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> retrieveUsers(){
        return userRepository.findAll();
    }

}
