package com.alzheimer.diagnosis.api.controllers.doctor.impl;

import com.alzheimer.diagnosis.api.controllers.doctor.IndexDoctorsController;
import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;
import com.alzheimer.diagnosis.api.servicers.doctor.IndexDoctorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class IndexDoctorsControllerImpl implements IndexDoctorsController {

    private final IndexDoctorsService service;

    @Override
    public ResponseEntity<List<DoctorResponseDTO>> doctors() {
        List<DoctorResponseDTO> doctors = service.index();
        return ResponseEntity.ok().body(doctors);
    }
}