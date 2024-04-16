package com.example.springbootodevister.services.concretes;

import com.example.springbootodevister.entity.User;
import com.example.springbootodevister.mappers.UserMapper;
import com.example.springbootodevister.repository.UserRepository;
import com.example.springbootodevister.services.abstracts.UserService;
import com.example.springbootodevister.services.dtos.request.AddUserRequest;
import com.example.springbootodevister.services.dtos.response.AddUserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AddUserResponse add(AddUserRequest request) {
       User users= UserMapper.Instance.userFromAndRequest(request);
       users = userRepository.save(users);
       AddUserResponse addUserResponse = UserMapper.Instance.responseFromUser(users);
       return addUserResponse;
    }
}
