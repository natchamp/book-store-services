package com.bookstore.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.bookstore.in")
@EnableDiscoveryClient
public class BookStoreApplication {

    public static void main(String[] args){
        SpringApplication.run(BookStoreApplication.class, args);
    }
}
