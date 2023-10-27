package com.api.prediction.controllers.patient;

import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.services.patient.FindPatientByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/patient")
public class FindPatientByIdController {

    @Autowired
    private FindPatientByIdService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PatientEntity> findById(@PathVariable Long id){
        PatientEntity patient = service.findById(id);
        return ResponseEntity.ok().body(patient);
    }
}