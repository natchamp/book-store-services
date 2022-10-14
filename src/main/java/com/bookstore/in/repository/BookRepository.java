package com.bookstore.in.repository;

import com.bookstore.in.entity.Book_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book_Details, String> {
    /*@Query(value = "select * from bookdetails where id= :bookId", nativeQuery = true)
    Book_Details getBookDetailsById(@Param("bookId") String bookId);*/
}
