package com.alzheimer.diagnosis.api.controllers.doctor;

import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IndexDoctorsController {

    @GetMapping(value = "/doctors")
    ResponseEntity<List<DoctorResponseDTO>> doctors();
}