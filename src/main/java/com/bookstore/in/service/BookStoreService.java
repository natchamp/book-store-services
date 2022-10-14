package com.bookstore.in.service;

import com.bookstore.in.entity.Book_Details;
import com.bookstore.in.generateddomain.service.dto.BookDetails;
import com.bookstore.in.mapper.EntityMapper;
import com.bookstore.in.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookStoreService implements IBookStoreService{

    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<BookDetails> getBookSearch(String bookType) {
        return null;
    }

    @Override
    public BookDetails getBookSearchBookId(String bookId) {

        Optional<Book_Details> book_details = bookRepository.findById(bookId);
        //Book_Details book_details = bookRepository.getBookDetailsById(bookId);

        BookDetails bookDetails = EntityMapper.mapBookDetails(book_details.get());

        return bookDetails;
    }
}
