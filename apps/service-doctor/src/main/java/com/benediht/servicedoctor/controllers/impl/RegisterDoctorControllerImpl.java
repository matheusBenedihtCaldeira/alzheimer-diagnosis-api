package com.benediht.servicedoctor.controllers.impl;

import com.benediht.servicedoctor.controllers.RegisterDoctorController;
import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.services.impl.RegisterDoctorServiceImpl;
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