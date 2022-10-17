package com.bookstore.in.service;

import com.bookstore.in.generateddomain.service.dto.BookDetails;
import com.bookstore.in.generateddomain.service.dto.PurchaseRequest;
import com.bookstore.in.generateddomain.service.dto.PurchaseResponse;

import java.util.List;

public interface IBookStoreService {
    List<BookDetails> getBookSearch(String bookType);

    BookDetails getBookSearchBookId(String bookId);

    PurchaseResponse bookPurchase(String bookId, PurchaseRequest purchaseRequest);


}
