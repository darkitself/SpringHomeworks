package com.homework.fifth_homework.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ValidationExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Response> handleRestValidationException(MethodArgumentNotValidException ex) {
        String message = String.format("%s %s", LocalDateTime.now(), ex.getMessage());
        Response response = new Response(message);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
}
