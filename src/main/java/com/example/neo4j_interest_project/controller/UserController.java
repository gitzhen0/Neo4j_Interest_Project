package com.example.neo4j_interest_project.controller;

import com.example.neo4j_interest_project.domain.User;
import com.example.neo4j_interest_project.repo.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id){

        return userRepository.findById(id);

    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
