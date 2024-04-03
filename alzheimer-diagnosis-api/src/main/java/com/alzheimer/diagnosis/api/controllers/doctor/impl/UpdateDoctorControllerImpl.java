package com.alzheimer.diagnosis.api.controllers.doctor.impl;

import com.alzheimer.diagnosis.api.controllers.doctor.UpdateDoctorController;
import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;
import com.alzheimer.diagnosis.api.servicers.doctor.impl.UpdateDoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class UpdateDoctorControllerImpl implements UpdateDoctorController {

    private final UpdateDoctorServiceImpl service;

    @Override
    public ResponseEntity<Void> update(Long id, DoctorDTO data) {
        service.update(id, data);
        return ResponseEntity.noContent().build();
    }
}