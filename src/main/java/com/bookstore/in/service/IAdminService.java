package com.bookstore.in.service;

import org.springframework.http.ResponseEntity;

public interface IAdminService {
    ResponseEntity<Void> deleteAdminBookRemoveBookId(String bookId);

    ResponseEntity<Void> patchAdminBookAdd();

    ResponseEntity<Void> postAdminBookAdd();
}
