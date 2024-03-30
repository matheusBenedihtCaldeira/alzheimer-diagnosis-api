package com.alzheimer.diagnosis.api.controllers.user.impl;

import com.alzheimer.diagnosis.api.controllers.user.IndexUsersController;
import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;
import com.alzheimer.diagnosis.api.servicers.user.impl.IndexUsersServiceImpl;
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
    public ResponseEntity<List<UserResponseDTO>> indexUsers() {
        List<UserResponseDTO> users = service.indexUsers();
        return ResponseEntity.ok().body(users);
    }
}