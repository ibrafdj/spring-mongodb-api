package com.ibrafdj.springmongodbapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public UserRepository userRepository;
    
    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
