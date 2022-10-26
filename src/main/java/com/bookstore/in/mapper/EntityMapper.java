package com.bookstore.in.mapper;

import com.bookstore.in.entity.BookDetailsDTO;
import com.bookstore.in.generateddomain.service.dto.BookDetails;

public class EntityMapper {

    public static BookDetails mapBookDetails(BookDetailsDTO bookDetailsDTO){

        BookDetails bookDetails = new BookDetails();

        bookDetails.setDescription(bookDetailsDTO.getDescription());
        return bookDetails;

    }

}
