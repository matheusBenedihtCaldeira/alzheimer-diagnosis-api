package com.api.prediction.controllers.patient;

import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.services.patient.IndexPatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/patients")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class IndexPatientsController {

    @Autowired
    private IndexPatientsService service;

    @GetMapping
    public ResponseEntity<List<PatientEntity>> index(){
        List<PatientEntity> patients = service.index();
        return ResponseEntity.ok().body(patients);
    }
}