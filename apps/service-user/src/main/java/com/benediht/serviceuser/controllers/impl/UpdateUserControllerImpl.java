package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.UpdateUserController;
import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.services.user.impl.UpdateUserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class UpdateUserControllerImpl implements UpdateUserController {

    private final UpdateUserServiceImpl service;

    @Override
    public ResponseEntity<Void> update(Long id, UserDTO data) {
        log.info("Request received: id={} data: {}", id, data);
        service.updateUser(id, data);
        return ResponseEntity.noContent().build();
    }
}