package com.example.springbootodevister.services.abstracts;

import com.example.springbootodevister.services.dtos.request.AddUserRequest;
import com.example.springbootodevister.services.dtos.response.AddUserResponse;

public interface UserService {
    AddUserResponse add(AddUserRequest request);
}
