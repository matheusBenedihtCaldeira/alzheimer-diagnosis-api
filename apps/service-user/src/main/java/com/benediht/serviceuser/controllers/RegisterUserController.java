package com.benediht.serviceuser.controllers;

import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegisterUserController {

    @PostMapping(value = "/register/user")
    ResponseEntity<UserEntity> register(@Valid @RequestBody UserDTO data);
}