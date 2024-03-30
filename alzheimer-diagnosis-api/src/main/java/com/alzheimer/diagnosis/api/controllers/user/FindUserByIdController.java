package com.alzheimer.diagnosis.api.controllers.user;

import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface FindUserByIdController {

    @GetMapping(value = "/user/{id}")
    public ResponseEntity<UserResponseDTO> findUserById(@PathVariable Long id);
}