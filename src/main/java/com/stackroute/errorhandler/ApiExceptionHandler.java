package com.stackroute.errorhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
Add appropriate annotation/s to create a bean for Global exception handling
*/

@RestControllerAdvice
public class ApiExceptionHandler {
    /*
        create a handler method for below exceptional condition:
        condition : employee not found
        body: failure message - http status: 404
     */

    /*
        create a handler method for below exceptional condition:
        condition : employee already exists
        body: failure message - http status: 409
     */


}
