package com.java.spring.repository;

import com.java.spring.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRepository {

    @Select("""
            SELECT * FROM users
            """)
    List<User> findAllUsers();
}
