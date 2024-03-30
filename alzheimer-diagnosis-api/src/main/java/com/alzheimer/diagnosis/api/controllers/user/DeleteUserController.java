package com.alzheimer.diagnosis.api.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeleteUserController {

    @DeleteMapping(value = "/delete/user/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);
}