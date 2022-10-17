package com.bookstore.in.service;

import com.bookstore.in.entity.Book_Details;
import com.bookstore.in.generateddomain.service.dto.BookDetails;
import com.bookstore.in.generateddomain.service.dto.PurchaseRequest;
import com.bookstore.in.generateddomain.service.dto.PurchaseResponse;
import com.bookstore.in.mapper.EntityMapper;
import com.bookstore.in.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BookStoreService implements IBookStoreService{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    RestTemplate restTemplate;

    @Value("${payment.url}")
    String paymentUrl;


    @Override
    public List<BookDetails> getBookSearch(String bookType) {
        return null;
    }

    @Override
    public BookDetails getBookSearchBookId(String bookId) {

        Optional<Book_Details> book_details = bookRepository.findById(bookId);

        BookDetails bookDetails = EntityMapper.mapBookDetails(book_details.get());

        return bookDetails;
    }

    @Override
    public PurchaseResponse bookPurchase(String bookId, PurchaseRequest purchaseRequest) {

        String url = paymentUrl+"/"+bookId;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<PurchaseRequest> entity = new HttpEntity<>(purchaseRequest, headers);
        ResponseEntity<PurchaseResponse> response = restTemplate.exchange(url, HttpMethod.POST, entity, PurchaseResponse.class);
        return response.getBody();
    }
}
