package com.bookstore.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class BookStoreApplication {

    public static void main(String args[]){
        SpringApplication.run(BookStoreApplication.class, args);
    }
}
