package com.benediht.servicedoctor.controllers;

import com.benediht.servicedoctor.models.dto.DoctorResponseDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IndexDoctorsController {

    @GetMapping(value = "/doctors")
    ResponseEntity<List<DoctorResponseDTO>> indexDoctors();
}