package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.UserService;
import com.example.exception.UserException;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String createUser(@RequestBody UserRequest request) {
        try {
            userService.addUser(request);
            return "User Created Successfully!";
        } catch (UserException e) {
            return e.getMessage();
        }
    }
}