package com.example.springbootodevister.services.dtos.response;

import com.example.springbootodevister.entity.UserStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class AddUserResponse {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    @Enumerated(EnumType.STRING)
    private UserStatus status;
}
