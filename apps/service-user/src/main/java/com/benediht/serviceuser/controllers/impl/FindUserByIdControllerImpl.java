package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.FindUserByIdController;
import com.benediht.serviceuser.models.dto.UserResponseDTO;
import com.benediht.serviceuser.services.user.impl.FindUserByIdServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class FindUserByIdControllerImpl implements FindUserByIdController {

    private final FindUserByIdServiceImpl service;

    @Override
    public ResponseEntity<UserResponseDTO> findUserById(Long id) {
        log.info("Request received: id:{}", id);
        UserResponseDTO user = service.findUserById(id);
        return ResponseEntity.ok().body(user);
    }
}