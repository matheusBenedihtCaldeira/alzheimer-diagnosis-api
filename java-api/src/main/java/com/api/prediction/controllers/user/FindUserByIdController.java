package com.api.prediction.controllers.user;

import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.services.user.FindUserByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FindUserByIdController {

    @Autowired
    private FindUserByIdService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserEntity> findById(@PathVariable Long id){
        UserEntity user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }
}