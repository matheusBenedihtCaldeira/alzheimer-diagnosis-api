package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.UpdateUserController;
import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.services.user.impl.UpdateUserServiceImpl;
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
        service.updateUser(id, data);
        return ResponseEntity.noContent().build();
    }
}