package com.alzheimer.diagnosis.api.controllers.user;

import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IndexUsersController {
    @GetMapping(value = "/users")
    ResponseEntity<List<UserResponseDTO>> indexUsers();
}