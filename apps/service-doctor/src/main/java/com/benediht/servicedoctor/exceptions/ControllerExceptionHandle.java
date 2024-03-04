package com.benediht.servicedoctor.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ControllerExceptionHandle {

    @ExceptionHandler(DoctorNotFoundException.class)
    public ResponseEntity<StandardError> doctorNotFoundException(DoctorNotFoundException e, HttpServletRequest req){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), "Not Found!", e.getMessage(), req.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}