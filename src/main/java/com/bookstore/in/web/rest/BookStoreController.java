package com.bookstore.in.web.rest;

import com.bookstore.in.generateddomain.service.dto.BookDetails;
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

    public  ResponseEntity<List<BookDetails>> getBookSearch(String bookType) {
        log.info("Name of Service : "+nameOfService);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public  ResponseEntity<BookDetails> getBookSearchBookId(String bookId) {

        BookDetails bookDetails = bookStoreService.getBookSearchBookId(bookId);
        return new ResponseEntity<>(bookDetails,HttpStatus.OK);

    }

}
