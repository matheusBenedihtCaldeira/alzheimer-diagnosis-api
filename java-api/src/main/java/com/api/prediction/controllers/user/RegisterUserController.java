package com.api.prediction.controllers.user;

import com.api.prediction.models.dto.UserDTO;
import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.services.user.RegisterUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/register")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegisterUserController {

    @Autowired
    private RegisterUserService service;

    @PostMapping(value = "/user")
    public ResponseEntity<UserEntity> register(@RequestBody @Valid UserDTO data){
        UserEntity user = service.register(data);
        return ResponseEntity.ok().body(user);
    }
}