package com.bookstore.in.web.rest.api;

import com.bookstore.in.generateddomain.service.dto.BookDetails;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Validated
public interface BookStoreApi {

    /**
     * GET /book/search/{bookType} : Your GET endpoint
     * Get List of books as per their type
     *
     * @param bookType  (required)
     * @return OK (status code 200)
     */
    @Operation(
            operationId = "getBookSearch",
            summary = "Your GET endpoint",
            tags = {  },
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = BookDetails.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/book/search/{bookType}",
            produces = { "application/json" }
    )
    default ResponseEntity<List<BookDetails>> _getBookSearch(
            @Parameter(name = "bookType", description = "", required = true) @PathVariable("bookType") String bookType
    ) {
        return getBookSearch(bookType);
    }

    // Override this method
    default  ResponseEntity<List<BookDetails>> getBookSearch(String bookType) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /book/search/{bookId} : Your GET endpoint
     * Get book details
     *
     * @param bookId  (required)
     * @return OK (status code 200)
     */
    @Operation(
            operationId = "getBookSearchBookId",
            summary = "Your GET endpoint",
            tags = {  },
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = BookDetails.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/book/search/id/{bookId}",
            produces = { "application/json" }
    )
    default ResponseEntity<BookDetails> _getBookSearchBookId(
            @Parameter(name = "bookId", description = "", required = true) @PathVariable("bookId") String bookId
    ) {
        return getBookSearchBookId(bookId);
    }

    // Override this method
    default  ResponseEntity<BookDetails> getBookSearchBookId(String bookId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


}
