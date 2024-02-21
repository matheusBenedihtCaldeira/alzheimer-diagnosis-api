package com.benediht.servicedoctor.controllers.impl;

import com.benediht.servicedoctor.controllers.IndexDoctorsController;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.services.impl.IndexDoctorsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class IndexDoctorsControllerImpl implements IndexDoctorsController {

    private final IndexDoctorsServiceImpl service;

    @Override
    public ResponseEntity<List<DoctorEntity>> indexDoctors() {
        List<DoctorEntity> doctors = service.indexDoctors();
        return ResponseEntity.ok().body(doctors);
    }
}