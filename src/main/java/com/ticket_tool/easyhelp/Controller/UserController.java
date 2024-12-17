package com.ticket_tool.easyhelp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket_tool.easyhelp.model.User;
import com.ticket_tool.easyhelp.repository.UserRepository;
import com.ticket_tool.easyhelp.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/users") // mapeia o contexto
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    
}
