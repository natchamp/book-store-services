package com.bookstore.in.service;

import com.bookstore.in.entity.BookDetailsDTO;
import com.bookstore.in.feign_client.BookStoreFeignClient;
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

import java.util.ArrayList;
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

    @Autowired
    BookStoreFeignClient feignClient;


    @Override
    public List<BookDetails> getBookSearch(String bookType) {
        return new ArrayList<>();
    }

    @Override
    public BookDetails getBookSearchBookId(String bookId) {

        Optional<BookDetailsDTO> bookDetailsDTO = bookRepository.findById(bookId);

        BookDetails bookDetails = EntityMapper.mapBookDetails(bookDetailsDTO.get());

        return bookDetails;
    }

    @Override
    public PurchaseResponse bookPurchase(String bookId, PurchaseRequest purchaseRequest) {

        /*String url = paymentUrl+"/"+bookId;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<PurchaseRequest> entity = new HttpEntity<>(purchaseRequest, headers);
        ResponseEntity<PurchaseResponse> response = restTemplate.exchange(url, HttpMethod.POST, entity, PurchaseResponse.class);
        return response.getBody();*/

        PurchaseResponse purchaseResponse = feignClient.postPaymentBookId(bookId, purchaseRequest);

        return purchaseResponse;


    }
}
