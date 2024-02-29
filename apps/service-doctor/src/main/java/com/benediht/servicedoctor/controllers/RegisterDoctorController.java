package com.benediht.servicedoctor.controllers;

import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegisterDoctorController {

    @PostMapping(value = "/register/doctor")
    ResponseEntity<DoctorEntity> register(@Valid @RequestBody DoctorDTO data);
}