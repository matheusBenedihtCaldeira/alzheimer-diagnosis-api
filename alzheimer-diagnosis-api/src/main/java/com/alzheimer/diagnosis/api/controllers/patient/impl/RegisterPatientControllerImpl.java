package com.alzheimer.diagnosis.api.controllers.patient.impl;

import com.alzheimer.diagnosis.api.controllers.patient.RegisterPatientController;
import com.alzheimer.diagnosis.api.models.dto.PatientDTO;
import com.alzheimer.diagnosis.api.models.entities.PatientEntity;
import com.alzheimer.diagnosis.api.servicers.patient.RegisterPatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class RegisterPatientControllerImpl implements RegisterPatientController {

    private final RegisterPatientService service;

    @Override
    public ResponseEntity<PatientEntity> register(PatientDTO data) {
        log.info("Data received: {}", data);
        PatientEntity patient = service.register(data);
        log.info("Patient saved: {}", patient);
        return ResponseEntity.ok().body(patient);
    }
}