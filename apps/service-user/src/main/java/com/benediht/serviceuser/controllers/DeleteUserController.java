package com.benediht.serviceuser.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeleteUserController {

    @DeleteMapping(value = "/delete/user/{id}")
    ResponseEntity<Void> delete(@Valid @PathVariable Long id);
}