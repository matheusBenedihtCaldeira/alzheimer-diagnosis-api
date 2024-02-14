package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.DeleteUserController;
import com.benediht.serviceuser.services.user.impl.DeleteUserServiceImpl;
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