package com.springboot_simple_registration_login.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot_simple_registration_login.exception.UserAlreadyExistsException;
import com.springboot_simple_registration_login.exception.UserNotFoundException;
import com.springboot_simple_registration_login.model.User;
import com.springboot_simple_registration_login.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public void register(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException("User already exists!");
        }

        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public boolean login(String email, String password) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("User not found"));
        return encoder.matches(password, user.getPassword());
    }
}