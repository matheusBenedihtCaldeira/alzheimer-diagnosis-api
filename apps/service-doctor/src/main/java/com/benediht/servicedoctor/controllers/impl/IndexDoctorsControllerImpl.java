package com.benediht.servicedoctor.controllers.impl;

import com.benediht.servicedoctor.controllers.IndexDoctorsController;
import com.benediht.servicedoctor.models.dto.DoctorResponseDTO;
import com.benediht.servicedoctor.services.impl.IndexDoctorsServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Log4j2
public class IndexDoctorsControllerImpl implements IndexDoctorsController {

    private final IndexDoctorsServiceImpl service;

    @Override
    public ResponseEntity<List<DoctorResponseDTO>> indexDoctors() {
        log.info("Request received!");
        List<DoctorResponseDTO> doctors = service.indexDoctors();
        return ResponseEntity.ok().body(doctors);
    }
}