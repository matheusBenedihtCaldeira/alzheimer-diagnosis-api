package com.benediht.servicedoctor.controllers.impl;

import com.benediht.servicedoctor.controllers.FindDoctorByIdController;
import com.benediht.servicedoctor.models.dto.DoctorResponseDTO;
import com.benediht.servicedoctor.services.impl.FindDoctorByIdServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/api")
@Log4j2
public class FindDoctorByIdControllerImpl implements FindDoctorByIdController {

    private final FindDoctorByIdServiceImpl service;
    @Override
    public ResponseEntity<DoctorResponseDTO> findDoctorById(Long id) {
        log.info("Request received!");
        DoctorResponseDTO doctorDTO = service.findDoctorById(id);
        return ResponseEntity.ok().body(doctorDTO);
    }
}