package com.benediht.serviceuser.controllers;

import com.benediht.serviceuser.models.entities.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface FindUserByIdController {

    @GetMapping(value = "/user/{id}")
    ResponseEntity<UserEntity> findUserById(@PathVariable Long id);
}