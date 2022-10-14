package com.bookstore.in.web.rest.api;

import com.bookstore.in.generateddomain.service.dto.PatchUsersUserIdRequest;
import com.bookstore.in.generateddomain.service.dto.PostUserRequest;
import com.bookstore.in.generateddomain.service.dto.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Validated
public interface StoreUserApi {

    /**
     * GET /user/{userId} : Get User Info by User ID
     * Retrieve the information of the user with the matching user ID.
     *
     * @param userId Id of an existing user. (required)
     * @return User Found (status code 200)
     *         or User Not Found (status code 404)
     */
    @Operation(
            operationId = "getUsersUserId",
            summary = "Get User Info by User ID",
            tags = {  },
            responses = {
                    @ApiResponse(responseCode = "200", description = "User Found", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "User Not Found")
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/user/{userId}",
            produces = { "application/json" }
    )
    default ResponseEntity<User> _getUsersUserId(
            @Parameter(name = "userId", description = "Id of an existing user.", required = true) @PathVariable("userId") Integer userId
    ) {
        return getUsersUserId(userId);
    }

    // Override this method
    default  ResponseEntity<User> getUsersUserId(Integer userId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * PATCH /user/{userId} : Update User Information
     * Update the information of an existing user.
     *
     * @param userId Id of an existing user. (required)
     * @param patchUsersUserIdRequest Patch user properties to update. (optional)
     * @return User Updated (status code 200)
     *         or User Not Found (status code 404)
     *         or Email Already Taken (status code 409)
     */
    @Operation(
            operationId = "patchUsersUserId",
            summary = "Update User Information",
            responses = {
                    @ApiResponse(responseCode = "200", description = "User Updated", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "User Not Found"),
                    @ApiResponse(responseCode = "409", description = "Email Already Taken")
            }
    )
    @RequestMapping(
            method = RequestMethod.PATCH,
            value = "/user/{userId}",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    default ResponseEntity<User> _patchUsersUserId(
            @Parameter(name = "userId", description = "Id of an existing user.", required = true) @PathVariable("userId") Integer userId,
            @Parameter(name = "PatchUsersUserIdRequest", description = "Patch user properties to update.") @Valid @RequestBody(required = false) PatchUsersUserIdRequest patchUsersUserIdRequest
    ) {
        return patchUsersUserId(userId, patchUsersUserIdRequest);
    }

    // Override this method
    default  ResponseEntity<User> patchUsersUserId(Integer userId, PatchUsersUserIdRequest patchUsersUserIdRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * POST /user : Create New User
     * Create a new user.
     *
     * @param postUserRequest Post the necessary fields for the API to create a new user. (optional)
     * @return User Created (status code 200)
     *         or Missing Required Information (status code 400)
     *         or Email Already Taken (status code 409)
     */
    @Operation(
            operationId = "postUser",
            summary = "Create New User",
            responses = {
                    @ApiResponse(responseCode = "200", description = "User Created", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
                    }),
                    @ApiResponse(responseCode = "400", description = "Missing Required Information"),
                    @ApiResponse(responseCode = "409", description = "Email Already Taken")
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/user",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    default ResponseEntity<Object> _postUser(
            @Parameter(name = "PostUserRequest", description = "Post the necessary fields for the API to create a new user.") @Valid @RequestBody(required = false) PostUserRequest postUserRequest
    ) {
        return postUser(postUserRequest);
    }

    // Override this method
    default  ResponseEntity<Object> postUser(PostUserRequest postUserRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
