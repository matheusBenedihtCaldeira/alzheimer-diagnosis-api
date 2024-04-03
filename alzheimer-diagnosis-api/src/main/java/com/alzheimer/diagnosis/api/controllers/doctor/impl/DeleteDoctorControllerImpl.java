package com.alzheimer.diagnosis.api.controllers.doctor.impl;

import com.alzheimer.diagnosis.api.controllers.doctor.DeleteDoctorController;
import com.alzheimer.diagnosis.api.servicers.doctor.impl.DeleteDoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class DeleteDoctorControllerImpl implements DeleteDoctorController {

    private final DeleteDoctorServiceImpl service;

    @Override
    public ResponseEntity<Void> delete(Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}