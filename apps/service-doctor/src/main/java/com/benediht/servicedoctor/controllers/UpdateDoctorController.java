package com.benediht.servicedoctor.controllers;

import com.benediht.servicedoctor.models.dto.DoctorDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UpdateDoctorController {

    @PutMapping(value = "/update/doctor/{id}")
    ResponseEntity<Void> updateDoctor(@Valid @NotNull @PathVariable Long id, @NotNull @RequestBody DoctorDTO data);
}