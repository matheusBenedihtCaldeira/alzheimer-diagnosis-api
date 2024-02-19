package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.RegisterUserController;
import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.services.user.impl.RegisterUserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class RegisterUserControllerImpl implements RegisterUserController {

    private final RegisterUserServiceImpl service;

    @Override
    public ResponseEntity<UserEntity> register(UserDTO data) {
        try{
            log.info("Request received: {}", data);
            UserEntity user = service.register(data);
            URI uri = ServletUriComponentsBuilder.fromUriString("http://localhost:8001/api/user/").path("{id}").buildAndExpand(user.getId()).toUri();
            return ResponseEntity.created(uri).build();
        }catch (Exception e){
            log.error("{}", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}