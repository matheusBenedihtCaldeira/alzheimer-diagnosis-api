package com.alzheimer.diagnosis.api.controllers.user.impl;

import com.alzheimer.diagnosis.api.controllers.user.DeleteUserController;
import com.alzheimer.diagnosis.api.servicers.user.impl.DeleteUserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class DeleteUserControllerImpl implements DeleteUserController {

    private final DeleteUserServiceImpl service;

    @Override
    public ResponseEntity<Void> delete(Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}