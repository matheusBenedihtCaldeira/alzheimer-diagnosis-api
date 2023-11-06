package com.api.prediction.controllers.user;

import com.api.prediction.services.user.DeleteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/delete")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DeleteUserController {

    @Autowired
    private DeleteUserService service;

    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}