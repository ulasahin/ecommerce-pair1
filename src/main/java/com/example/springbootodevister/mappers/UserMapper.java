package com.example.springbootodevister.mappers;

import com.example.springbootodevister.entity.Product;
import com.example.springbootodevister.entity.User;
import com.example.springbootodevister.services.dtos.request.AddUserRequest;
import com.example.springbootodevister.services.dtos.response.AddUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper Instance = Mappers.getMapper(UserMapper.class);
    User userFromAndRequest(AddUserRequest request);
    AddUserResponse responseFromUser(User user);
}
