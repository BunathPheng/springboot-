package com.java.spring.service;

import com.java.spring.model.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
}
