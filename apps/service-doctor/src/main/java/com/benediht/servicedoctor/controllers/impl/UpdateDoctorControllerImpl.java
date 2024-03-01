package com.benediht.servicedoctor.controllers.impl;

import com.benediht.servicedoctor.controllers.UpdateDoctorController;
import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.services.impl.UpdateDoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class UpdateDoctorControllerImpl implements UpdateDoctorController {

    private final UpdateDoctorServiceImpl service;

    @Override
    public ResponseEntity<Void> updateDoctor(Long id, DoctorDTO data) {
        service.updateDoctor(id, data);
        return ResponseEntity.noContent().build();
    }
}