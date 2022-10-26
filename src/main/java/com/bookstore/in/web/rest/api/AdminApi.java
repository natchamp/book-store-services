package com.bookstore.in.web.rest.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface AdminApi {

    /**
     * DELETE /admin/book/remove/{bookId} :
     *
     * @param bookId  (required)
     * @return OK (status code 200)
     */
    @Operation(
            operationId = "deleteAdminBookRemoveBookId",
            summary = "",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK")
            }
    )
    @DeleteMapping(
            value = "/admin/book/remove/{bookId}"
    )
    default ResponseEntity<Void> _deleteAdminBookRemoveBookId(
            @Parameter(name = "bookId", description = "", required = true) @PathVariable("bookId") String bookId
    ) {
        return deleteAdminBookRemoveBookId(bookId);
    }

    // Override this method
    default  ResponseEntity<Void> deleteAdminBookRemoveBookId(String bookId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /admin/book/add :
     *
     * @return OK (status code 200)
     */
    @Operation(
            operationId = "patchAdminBookAdd",
            summary = "",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK")
            }
    )
    @PatchMapping(
            value = "/admin/book/add"
    )
    default ResponseEntity<Void> _patchAdminBookAdd(

    ) {
        return patchAdminBookAdd();
    }

    // Override this method
    default  ResponseEntity<Void> patchAdminBookAdd() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /admin/book/add :
     *
     * @return OK (status code 200)
     */
    @Operation(
            operationId = "postAdminBookAdd",
            summary = "",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK")
            }
    )
    @PostMapping(
            value = "/admin/book/add"
    )
    default ResponseEntity<Void> _postAdminBookAdd(

    ) {
        return postAdminBookAdd();
    }

    // Override this method
    default  ResponseEntity<Void> postAdminBookAdd() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}
