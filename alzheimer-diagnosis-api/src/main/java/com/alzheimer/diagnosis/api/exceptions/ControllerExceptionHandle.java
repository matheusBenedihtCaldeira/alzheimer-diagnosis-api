package com.alzheimer.diagnosis.api.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandle {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<StandardError> userNotFoundException(UserNotFoundException e, HttpServletRequest req){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), "User not found!", e.getMessage(), req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DoctorNotFoundException.class)
    public ResponseEntity<StandardError> doctorNotFoundException(DoctorNotFoundException e, HttpServletRequest req){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), "Doctor not found!", e.getMessage(), req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(EmailAlreadyInUseException.class)
    public ResponseEntity<StandardError> doctorAlreadyRegisteredException(EmailAlreadyInUseException e, HttpServletRequest req){
        HttpStatus status = HttpStatus.CONFLICT;
        StandardError err = new StandardError(Instant.now(), status.value(), "E-mail already in use!", e.getMessage(), req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}