package com.alzheimer.diagnosis.api.controllers.doctor.impl;

import com.alzheimer.diagnosis.api.controllers.doctor.FindDoctorByIdController;
import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import com.alzheimer.diagnosis.api.servicers.doctor.impl.FindDoctorByIdServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class FindDoctorByIdControllerImpl implements FindDoctorByIdController {

    private final FindDoctorByIdServiceImpl service;

    @Override
    public ResponseEntity<DoctorResponseDTO> findDoctorById(Long id) {
        DoctorResponseDTO doctor = service.findDoctorById(id);
        return ResponseEntity.ok().body(doctor);
    }
}