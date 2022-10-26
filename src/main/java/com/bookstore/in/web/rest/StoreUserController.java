package com.bookstore.in.web.rest;

import com.bookstore.in.generateddomain.service.dto.PatchUsersUserIdRequest;
import com.bookstore.in.generateddomain.service.dto.PostUserRequest;
import com.bookstore.in.generateddomain.service.dto.User;
import com.bookstore.in.web.rest.api.StoreUserApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreUserController implements StoreUserApi {

    @Override
    public  ResponseEntity<User> getUsersUserId(Integer userId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<User> patchUsersUserId(Integer userId, PatchUsersUserIdRequest patchUsersUserIdRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<Object> postUser(PostUserRequest postUserRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
