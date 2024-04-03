package com.alzheimer.diagnosis.api.controllers.doctor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeleteDoctorController {

    @DeleteMapping(value = "/doctor/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id);
}