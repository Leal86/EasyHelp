package com.ticket_tool.easyhelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket_tool.easyhelp.model.User;
import com.ticket_tool.easyhelp.repository.UserRepository;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> listAll() {
        return userRepository.findAll();
    }
    
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long idUser) {
        userRepository.deleteById(idUser);
    }
}
