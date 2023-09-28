package com.splitwise.controllers;

import com.splitwise.dtos.CreateUserRequestDto;
import com.splitwise.dtos.CreateUserResponseDto;
import com.splitwise.models.User;
import com.splitwise.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    UserController(UserService userService) {
        System.out.println("IN USER SERVICE -----------------------------");
        this.userService = userService;
    }

    @PostMapping("/")
    public CreateUserResponseDto registerUser(@RequestBody CreateUserRequestDto createUserRequestDto) {
        System.out.println("POST -----------------------------");
        User user = this.userService.registerUser(
                createUserRequestDto.getUserName(),
                createUserRequestDto.getPhone(),
                createUserRequestDto.getPassword()
        );
        CreateUserResponseDto response = new CreateUserResponseDto(user);
        return response;
    }
}
