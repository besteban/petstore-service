package com.evo.petstore.service.impl;

import com.evo.petstore.service.UserApiService;
import java.util.List;
import com.evo.petstore.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import com.evo.api.springboot.exception.ApiException;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * A delegate to be called by the {@link UserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class UserApiServiceImpl implements UserApiService{

     @Override
    public Void createUser(User body) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Void createUsersWithArrayInput(List<User> body) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Void createUsersWithListInput(List<User> body) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Void deleteUser(String username) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public User getUserByName(String username) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public String loginUser(String username,
        String password) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Void logoutUser() throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

     @Override
    public Void updateUser(String username,
        User body) throws ApiException{
        // TODO Auto-generated method stub
		return null;
    }

}
