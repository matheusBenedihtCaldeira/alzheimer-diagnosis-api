package com.alzheimer.diagnosis.api.controllers.user.impl;

import com.alzheimer.diagnosis.api.controllers.user.RegisterUserController;
import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import com.alzheimer.diagnosis.api.servicers.user.RegisterUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class RegisterUserControllerImpl implements RegisterUserController {

    private final RegisterUserService service;

    @Override
    public ResponseEntity<UserEntity> register(UserDTO data) {
        log.info("Request received");
        UserEntity user = service.register(data);
        return ResponseEntity.ok().body(user);
    }
}