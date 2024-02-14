package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.IndexUsersController;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.services.user.IndexUsersService;
import com.benediht.serviceuser.services.user.impl.IndexUsersServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class IndexUsersControllerImpl implements IndexUsersController {

    private final IndexUsersServiceImpl service;

    @Override
    public ResponseEntity<List<UserEntity>> index() {
        List<UserEntity> users = service.indexUsers();
        return ResponseEntity.ok().body(users);
    }
}