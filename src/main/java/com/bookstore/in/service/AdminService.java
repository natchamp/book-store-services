package com.bookstore.in.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService{
    @Override
    public ResponseEntity<Void> deleteAdminBookRemoveBookId(String bookId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> patchAdminBookAdd() {
        return null;
    }

    @Override
    public ResponseEntity<Void> postAdminBookAdd() {
        return null;
    }
}
