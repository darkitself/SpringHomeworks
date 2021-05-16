package com.homework.seventhhomework.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;

@ControllerAdvice
public class AccessExceptionHandler {
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<Response> handleRestValidationException(AccessDeniedException ex) {
        String message = String.format("%s %s", LocalDateTime.now(), ex.getMessage());
        Response response = new Response(message);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }
}
