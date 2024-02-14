package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.RegisterUserController;
import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.services.user.RegisterUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class RegisterUserControllerImpl implements RegisterUserController {

    private final RegisterUserService service;


    @Override
    public ResponseEntity<UserEntity> register(UserDTO data) {
        UserEntity user = service.register(data);
        return ResponseEntity.ok().body(user);
    }
}