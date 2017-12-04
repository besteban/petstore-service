package com.evo.petstore.api;

import java.util.List;
import com.evo.petstore.model.User;
import com.evo.petstore.service.*;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.evo.api.springboot.exception.ApiException;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserApiController implements UserApi {

	@Autowired
    private UserApiService service;

    public ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody User body) throws ApiException{
        return new ResponseEntity<Void>(service.createUser(body), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<User> body) throws ApiException{
        return new ResponseEntity<Void>(service.createUsersWithArrayInput(body), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<User> body) throws ApiException{
        return new ResponseEntity<Void>(service.createUsersWithListInput(body), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username) throws ApiException{
        return new ResponseEntity<Void>(service.deleteUser(username), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true) @PathVariable("username") String username) throws ApiException{
        return new ResponseEntity<User>(service.getUserByName(username), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password) throws ApiException{
        return new ResponseEntity<String>(service.loginUser(username, password), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> logoutUser() throws ApiException{
        return new ResponseEntity<Void>(service.logoutUser(), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("username") String username,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) throws ApiException{
        return new ResponseEntity<Void>(service.updateUser(username, body), HttpStatus.NOT_IMPLEMENTED);
    }

}
