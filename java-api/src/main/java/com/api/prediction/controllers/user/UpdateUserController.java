package com.api.prediction.controllers.user;

import com.api.prediction.models.dto.UserDTO;
import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.services.user.UpdateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/update")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UpdateUserController {

    @Autowired
    private UpdateUserService service;

    @PutMapping(value = "/user/{id}")
    public ResponseEntity<UserEntity> update(@RequestBody UserDTO data, @PathVariable Long id){
        UserEntity user = service.update(data, id);
        return ResponseEntity.ok().body(user);
    }
}