package com.java.spring.controller;

import com.java.spring.model.dto.response.APIResponse;
import com.java.spring.model.entity.User;
import com.java.spring.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


//    public ResponseEntity<APIResponse<List<User>>> getUsers() {
//        System.out.println("Working on the get all users!");
//        APIResponse<List<User>> res = APIResponse.<List<User>>builder()
//                .message("success")
//                .payload(userService.findAllUsers())
//                .status(HttpStatus.OK) // keep only if it's part of APIResponse
//                .timestamp(LocalDateTime.now())
//                .build();
//
//        return ResponseEntity.ok(res);
//    }

    @GetMapping
    public ResponseEntity<APIResponse<List<User>>> getUsers() {
        System.out.println("Working on the get all users!");
        APIResponse<List<User>> res = APIResponse.<List<User>>builder()
                .message("success")
                .payload(userService.findAllUsers())
                .status(HttpStatus.OK) // keep only if it's part of APIResponse
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(res);
    }

    @GetMapping("/test")
    public String getString() {
        return "This API is working!";
    }
    @GetMapping("/hello")
    public String getStringd() {
        return "hello This API is working !";
    }
    @GetMapping("/g")
    public String getStringl() {
        return "hello This API is working !";
    }
    @GetMapping("/ges")
    public String getStringles() {
        return "hello This API is working !";
    }
    @GetMapping("/gess")
    public String getStringless() {
        return "hello This API is working !";
    }
    @GetMapping("/gesss")
    public String getStringlessz() {
        return "hello This API is working !";
    }
    @GetMapping("/gessss")
    public String getStringlessza() {
        return "hello This API is working !";
    }
    @GetMapping("/gesssse")
    public String getStringlesszae() {
        return "hello This API is working !";
    }
    @GetMapping("/k")
    public String getStringlesszaek() {
        return "hello This API is working !";
    }
}
