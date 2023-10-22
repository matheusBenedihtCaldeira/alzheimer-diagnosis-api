package com.api.prediction.controllers.exceptions;

import com.api.prediction.services.exceptions.ObjectNotFoundException;
import com.api.prediction.services.exceptions.UserAlredyExistsException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionsHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objNotFound(ObjectNotFoundException e, HttpServletRequest req){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), "Not found", e.getMessage(), req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(UserAlredyExistsException.class)
    public ResponseEntity<StandardError> userAlredyExists(UserAlredyExistsException e, HttpServletRequest req){
        HttpStatus status = HttpStatus.CONFLICT;
        StandardError err = new StandardError(Instant.now(), status.value(), "User alredy exist", e.getMessage(), req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}