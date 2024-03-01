package com.benediht.servicedoctor.controllers;

import com.benediht.servicedoctor.models.dto.DoctorResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface FindDoctorByIdController {

    @GetMapping(value = "/doctor/{id}")
    ResponseEntity<DoctorResponseDTO> findDoctorById(@Valid @NotNull @PathVariable Long id);
}