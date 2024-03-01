package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.IndexUsersController;
import com.benediht.serviceuser.models.dto.UserResponseDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.services.user.impl.IndexUsersServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class IndexUsersControllerImpl implements IndexUsersController {

    private final IndexUsersServiceImpl service;

    @Override
    public ResponseEntity<List<UserResponseDTO>> index() {
        try {
            List<UserResponseDTO> users = service.indexUsers();
            return ResponseEntity.ok().body(users);
        }catch (Exception e){
            log.error("{}", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}