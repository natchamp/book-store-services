package com.bookstore.in.service;

import com.bookstore.in.generateddomain.service.dto.BookDetails;

import java.util.List;

public interface IBookStoreService {
    List<BookDetails> getBookSearch(String bookType);

    BookDetails getBookSearchBookId(String bookId);

}
