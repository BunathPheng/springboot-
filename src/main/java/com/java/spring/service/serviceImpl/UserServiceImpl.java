package com.java.spring.service.serviceImpl;

import com.java.spring.model.entity.User;
import com.java.spring.repository.UserRepository;
import com.java.spring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }
}
