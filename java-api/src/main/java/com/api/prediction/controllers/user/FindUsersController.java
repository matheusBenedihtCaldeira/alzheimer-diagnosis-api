package com.api.prediction.controllers.user;

import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.services.user.FindUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FindUsersController {

    @Autowired
    private FindUsersService service;

    @GetMapping
    public ResponseEntity<List<UserEntity>> findUsers(){
        List<UserEntity> users = service.findUsers();
        return ResponseEntity.ok().body(users);
    }
}