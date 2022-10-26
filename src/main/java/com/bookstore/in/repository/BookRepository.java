package com.bookstore.in.repository;

import com.bookstore.in.entity.BookDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookDetailsDTO, String> {
}
