package com.bookstore.in.feign_client;

import com.bookstore.in.generateddomain.service.dto.PurchaseRequest;
import com.bookstore.in.generateddomain.service.dto.PurchaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient(name="payment-service", url = "localhost:8081")
@FeignClient(name="payment-service")
//@RibbonClient(name = "payment-service")
public interface BookStoreFeignClient {

    @PostMapping("/payment/{bookId}")
    public PurchaseResponse postPaymentBookId(@PathVariable(name = "bookId") String bookId, @RequestBody PurchaseRequest paymentRequest);
}
