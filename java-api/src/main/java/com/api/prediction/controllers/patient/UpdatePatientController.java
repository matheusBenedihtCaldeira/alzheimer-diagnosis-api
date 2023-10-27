package com.api.prediction.controllers.patient;

import com.api.prediction.models.dto.PatientDTO;
import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.services.patient.UpdatePatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/update")
public class UpdatePatientController {

    @Autowired
    private UpdatePatientService service;

    @PutMapping(value = "/patient/{id}")
    public ResponseEntity<PatientEntity> update(@PathVariable Long id, @RequestBody PatientDTO data){
        PatientEntity patient = service.update(id, data);
        return ResponseEntity.ok().body(patient);
    }
}