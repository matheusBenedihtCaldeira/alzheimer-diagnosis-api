package com.api.prediction.controllers.pacient;

import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.services.pacient.FindPacientByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pacient")
public class FindPacientByIdController {

    @Autowired
    private FindPacientByIdService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PacientEntity> findById(@PathVariable Long id){
        PacientEntity pacient = service.findById(id);
        return ResponseEntity.ok().body(pacient);
    }
}