package com.api.prediction.controllers.pacient;

import com.api.prediction.models.dto.PacientDTO;
import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.services.pacient.RegisterPacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/register")
public class RegisterPacientController {

    @Autowired
    private RegisterPacientService service;

    @PostMapping(value = "/pacient")
    public ResponseEntity<PacientEntity> register(@RequestBody PacientDTO data){
        PacientEntity pacient = service.register(data);
        return ResponseEntity.ok().body(pacient);
    }
}