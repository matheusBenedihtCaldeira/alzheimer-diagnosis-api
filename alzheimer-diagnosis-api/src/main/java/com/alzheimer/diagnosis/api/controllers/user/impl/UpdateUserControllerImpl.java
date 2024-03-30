package com.alzheimer.diagnosis.api.controllers.user.impl;

import com.alzheimer.diagnosis.api.controllers.user.UpdateUserController;
import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import com.alzheimer.diagnosis.api.servicers.user.impl.UpdateUserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class UpdateUserControllerImpl implements UpdateUserController {

    private final UpdateUserServiceImpl service;

    @Override
    public ResponseEntity<Void> update(Long id, UserDTO data) {
        service.update(id, data);
        return ResponseEntity.noContent().build();
    }
}