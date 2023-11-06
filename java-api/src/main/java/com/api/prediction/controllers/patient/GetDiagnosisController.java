package com.api.prediction.controllers.patient;

import com.api.prediction.models.dto.PredictionRequest;
import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.services.patient.GetDiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/patient")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GetDiagnosisController {

    @Autowired
    private GetDiagnosisService service;

    @PostMapping(value = "/diagnosis/{id}")
    public ResponseEntity<PatientEntity> getDiagnosis(@PathVariable Long id, @RequestBody PredictionRequest data){
        PatientEntity patient = service.addDiagnosis(id, data);
        return ResponseEntity.ok().body(patient);
    }
}
