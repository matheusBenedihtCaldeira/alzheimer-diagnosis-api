package com.alzheimer.diagnosis.api.controllers.user.impl;

import com.alzheimer.diagnosis.api.controllers.user.FindUserByIdController;
import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;
import com.alzheimer.diagnosis.api.servicers.user.impl.FindUserByIdServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class FindUserByIdControllerImpl implements FindUserByIdController {

    private final FindUserByIdServiceImpl service;

    @Override
    public ResponseEntity<UserResponseDTO> findUserById(Long id) {
        UserResponseDTO userResponseDTO = service.findUserById(id);
        return ResponseEntity.ok().body(userResponseDTO);
    }
}