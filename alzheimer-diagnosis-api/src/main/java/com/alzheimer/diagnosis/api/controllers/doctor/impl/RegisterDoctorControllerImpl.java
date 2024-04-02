package com.alzheimer.diagnosis.api.controllers.doctor.impl;

import com.alzheimer.diagnosis.api.controllers.doctor.RegisterDoctorController;
import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import com.alzheimer.diagnosis.api.servicers.doctor.impl.RegisterDoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class RegisterDoctorControllerImpl implements RegisterDoctorController {

    private final RegisterDoctorServiceImpl service;

    @Override
    public ResponseEntity<DoctorEntity> register(DoctorDTO data) {
        DoctorEntity doctor = service.register(data);
        return ResponseEntity.ok().body(doctor);
    }
}