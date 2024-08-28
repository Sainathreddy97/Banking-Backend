package com.authenticate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authenticate.entity.User;
import com.authenticate.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
