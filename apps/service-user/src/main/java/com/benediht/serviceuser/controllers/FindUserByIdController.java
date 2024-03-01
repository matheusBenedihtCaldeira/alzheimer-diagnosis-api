package com.benediht.serviceuser.controllers;

import com.benediht.serviceuser.models.dto.UserResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface FindUserByIdController {

    @GetMapping(value = "/user/{id}")
    ResponseEntity<UserResponseDTO> findUserById(@Valid @NotNull @PathVariable Long id);
}