package com.benediht.servicedoctor.controllers.impl;

import com.benediht.servicedoctor.controllers.RegisterDoctorController;
import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.services.impl.RegisterDoctorServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class RegisterDoctorControllerImpl implements RegisterDoctorController {

    private final RegisterDoctorServiceImpl service;

    @Override
    public ResponseEntity<DoctorEntity> register(DoctorDTO data) {
        log.info("Request received: {}", data);
        DoctorEntity doctor = service.register(data);
        URI uri = ServletUriComponentsBuilder.fromUriString("http://localhost:8002/api/doctor/").path("{id}").buildAndExpand(doctor.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}