package com.bookstore.in.web.rest;

import com.bookstore.in.generateddomain.service.dto.BookDetails;
import com.bookstore.in.generateddomain.service.dto.PurchaseRequest;
import com.bookstore.in.generateddomain.service.dto.PurchaseResponse;
import com.bookstore.in.service.BookStoreService;
import com.bookstore.in.web.rest.api.BookStoreApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookStoreController implements BookStoreApi {

    @Autowired
    private BookStoreService bookStoreService;

    Logger log = LoggerFactory.getLogger(BookStoreController.class);

    @Value("${message:Mesage}")
    private String nameOfService;

    @Override
    public  ResponseEntity<List<BookDetails>> getBookSearch(String bookType) {
        log.info("Name of Service : {} ", nameOfService);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public  ResponseEntity<BookDetails> getBookSearchBookId(String bookId) {

        BookDetails bookDetails = bookStoreService.getBookSearchBookId(bookId);
        return new ResponseEntity<>(bookDetails,HttpStatus.OK);

    }

    @Override
    public ResponseEntity<PurchaseResponse> postBookPurchaseBookId(String bookId, PurchaseRequest purchaseRequest) {
        log.info("Request received for purchase Book with ID : {}", bookId);
        PurchaseResponse response = bookStoreService.bookPurchase(bookId, purchaseRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }



}
