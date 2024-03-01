package com.benediht.serviceuser.controllers;

import com.benediht.serviceuser.models.dto.UserResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IndexUsersController {

    @GetMapping(value = "/users")
    ResponseEntity<List<UserResponseDTO>> index();
}