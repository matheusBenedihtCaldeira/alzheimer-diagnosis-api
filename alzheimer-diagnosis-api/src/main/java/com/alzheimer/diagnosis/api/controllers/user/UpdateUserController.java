package com.alzheimer.diagnosis.api.controllers.user;

import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UpdateUserController {

    @PutMapping(value = "/update/user/{id}")
    ResponseEntity<Void> update(@PathVariable Long id, @RequestBody UserDTO data);
}