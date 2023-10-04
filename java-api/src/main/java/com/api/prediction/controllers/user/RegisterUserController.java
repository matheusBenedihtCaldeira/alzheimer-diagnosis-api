package com.api.prediction.controllers.user;

import com.api.prediction.models.dto.UserDTO;
import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.services.user.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/register")
public class RegisterUserController {

    @Autowired
    private RegisterUserService service;

    @PostMapping(value = "/user")
    public ResponseEntity<UserEntity> register(@RequestBody UserDTO data){
        UserEntity user = service.register(data);
        return ResponseEntity.ok().body(user);
    }
}