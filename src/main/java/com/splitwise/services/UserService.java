package com.splitwise.services;

import com.splitwise.repositories.UserRepository;
import com.splitwise.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String name, String phone, String password) {
        User user = new User(name, phone, password);
        User saved = userRepository.save(user);
        return saved;
    }
}
