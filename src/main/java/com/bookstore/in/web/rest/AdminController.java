package com.bookstore.in.web.rest;

import com.bookstore.in.web.rest.api.AdminApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController implements AdminApi {

    @Override
    public  ResponseEntity<Void> deleteAdminBookRemoveBookId(String bookId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    @Override
    public  ResponseEntity<Void> patchAdminBookAdd() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    @Override
    public  ResponseEntity<Void> postAdminBookAdd() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
