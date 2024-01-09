package com.api.prediction.controllers.patient;

import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.services.patient.FindPatientByDiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/search/patient/diagnosis")
public class FindPatientByDiagnosisController {

    @Autowired
    private FindPatientByDiagnosisService service;

    @GetMapping
    public ResponseEntity<List<PatientEntity>> findPatientByDiagnosis(@RequestParam String diagnosis){
        List<PatientEntity> patients = service.findPatientByDiagnosis(diagnosis);
        return ResponseEntity.ok().body(patients);
    }
}