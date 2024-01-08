package com.api.prediction.controllers.patient;

import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.services.patient.FindPatientByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/search/patient")
public class FindPatientByNameController {

    @Autowired
    private FindPatientByNameService service;

    @GetMapping
    public ResponseEntity<List<PatientEntity>> findPatientByName(@RequestParam String name){
        List<PatientEntity> patient = service.findPatientByName(name);
        return ResponseEntity.ok().body(patient);
    }
}