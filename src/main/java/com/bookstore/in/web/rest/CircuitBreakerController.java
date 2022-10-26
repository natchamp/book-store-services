package com.bookstore.in.web.rest;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    Logger log = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/sample-api")
    //@Retry(name = "sample-api", fallbackMethod = "fallbackResponse")    //3 times it will retry //for custom retry add app.prop
    //@CircuitBreaker(name="default", fallbackMethod = "fallbackResponse")
    //@RateLimiter(name="default")
    @Bulkhead(name="default")
    public String sampleApi()
    {
        log.info("Sample Request Received");

        return "SAmple-API";
    }

    public String fallbackResponse(Exception ex)
    {
        log.info("Exception : {}", ex.getMessage());
        return "Fallback Response";
    }
}
