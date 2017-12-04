package com.evo.petstore.service;

import java.util.List;
import com.evo.petstore.model.User;
import com.evo.api.springboot.exception.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

/**
 * A delegate to be called by the {@link UserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface UserApiService {

    /**
     * @see UserApi#createUser
     */
    Void createUser(User body) throws ApiException;

    /**
     * @see UserApi#createUsersWithArrayInput
     */
    Void createUsersWithArrayInput(List<User> body) throws ApiException;

    /**
     * @see UserApi#createUsersWithListInput
     */
    Void createUsersWithListInput(List<User> body) throws ApiException;

    /**
     * @see UserApi#deleteUser
     */
    Void deleteUser(String username) throws ApiException;

    /**
     * @see UserApi#getUserByName
     */
    User getUserByName(String username) throws ApiException;

    /**
     * @see UserApi#loginUser
     */
    String loginUser(String username,
        String password) throws ApiException;

    /**
     * @see UserApi#logoutUser
     */
    Void logoutUser() throws ApiException;

    /**
     * @see UserApi#updateUser
     */
    Void updateUser(String username,
        User body) throws ApiException;

}
