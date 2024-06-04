package com.alzheimer.diagnosis.api.controllers.patient;

import com.alzheimer.diagnosis.api.models.dto.PatientDTO;
import com.alzheimer.diagnosis.api.models.entities.PatientEntity;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegisterPatientController {

    @PostMapping(value = "/register/patient")
    ResponseEntity<PatientEntity> register(@Valid @RequestBody PatientDTO data);
}