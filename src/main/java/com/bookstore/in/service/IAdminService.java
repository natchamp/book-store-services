package com.bookstore.in.service;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface IAdminService {
    ResponseEntity<Void> deleteAdminBookRemoveBookId(String bookId);

    ResponseEntity<Void> patchAdminBookAdd();

    ResponseEntity<Void> postAdminBookAdd();
}
