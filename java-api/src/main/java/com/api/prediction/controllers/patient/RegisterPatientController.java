package com.api.prediction.controllers.patient;

import com.api.prediction.models.dto.PatientDTO;
import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.services.patient.RegisterPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/register")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegisterPatientController {

    @Autowired
    private RegisterPatientService service;

    @PostMapping(value = "/patient")
    public ResponseEntity<PatientEntity> register(@RequestBody PatientDTO data){
        PatientEntity patient = service.register(data);
        return ResponseEntity.ok().body(patient);
    }
}