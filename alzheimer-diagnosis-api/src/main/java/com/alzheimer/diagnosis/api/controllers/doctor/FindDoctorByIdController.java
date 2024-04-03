package com.alzheimer.diagnosis.api.controllers.doctor;

import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface FindDoctorByIdController {
    @GetMapping(value = "/doctor/{id}")
    ResponseEntity<DoctorResponseDTO> findDoctorById(@PathVariable Long id);
}