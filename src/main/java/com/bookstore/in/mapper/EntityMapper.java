package com.bookstore.in.mapper;

import com.bookstore.in.entity.Book_Details;
import com.bookstore.in.generateddomain.service.dto.BookDetails;

public class EntityMapper {

    public static BookDetails mapBookDetails(Book_Details book_Details){

        BookDetails bookDetails = new BookDetails();

        bookDetails.setDescription(book_Details.getDescription());
        return bookDetails;

    }

}
