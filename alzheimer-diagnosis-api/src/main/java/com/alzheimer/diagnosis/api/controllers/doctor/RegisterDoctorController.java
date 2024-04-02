package com.alzheimer.diagnosis.api.controllers.doctor;

import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegisterDoctorController {

    @PostMapping(value = "/register/doctor")
    ResponseEntity<DoctorEntity> register(@RequestBody DoctorDTO data);
}