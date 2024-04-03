package com.alzheimer.diagnosis.api.controllers.doctor;

import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UpdateDoctorController {

    @PutMapping(value = "/doctor/{id}")
    ResponseEntity<Void> update(@PathVariable Long id, @RequestBody DoctorDTO data);
}