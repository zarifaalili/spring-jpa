package org.example.jpa.exception;

import org.example.jpa.model.enums.ErrorMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handle(NotFoundException exception){
        return ResponseEntity.status(404).body( new ErrorResponse(exception.getMessage(), ErrorMessage.STUDENT_NOT_FOUND.name()));
    }
}
