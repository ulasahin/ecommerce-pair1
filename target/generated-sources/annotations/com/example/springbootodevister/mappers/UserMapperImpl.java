package com.example.springbootodevister.mappers;

import com.example.springbootodevister.entity.User;
import com.example.springbootodevister.services.dtos.request.AddUserRequest;
import com.example.springbootodevister.services.dtos.response.AddUserResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-16T11:06:19+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userFromAndRequest(AddUserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( request.getFirstName() );
        user.setLastName( request.getLastName() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );
        user.setStatus( request.getStatus() );

        return user;
    }

    @Override
    public AddUserResponse responseFromUser(User user) {
        if ( user == null ) {
            return null;
        }

        AddUserResponse addUserResponse = new AddUserResponse();

        return addUserResponse;
    }
}
