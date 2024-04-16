package com.example.springbootodevister.controller;

import com.example.springbootodevister.services.abstracts.CategoryService;
import com.example.springbootodevister.services.abstracts.UserService;
import com.example.springbootodevister.services.dtos.request.AddCategoryRequest;
import com.example.springbootodevister.services.dtos.request.AddUserRequest;
import com.example.springbootodevister.services.dtos.response.AddCategoryResponse;
import com.example.springbootodevister.services.dtos.response.AddUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    UserService userService;

    @PostMapping
    public AddUserResponse add(@RequestBody AddUserRequest request) {
        return userService.add(request);
    }
}