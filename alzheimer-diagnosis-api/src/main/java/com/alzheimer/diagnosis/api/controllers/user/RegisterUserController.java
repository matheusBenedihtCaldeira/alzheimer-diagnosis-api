package com.alzheimer.diagnosis.api.controllers.user;

import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegisterUserController {

    @PostMapping(value = "/register/user")
    ResponseEntity<UserEntity> register(@Valid @RequestBody UserDTO data);
}