package com.benediht.servicedoctor.controllers.impl;

import com.benediht.servicedoctor.controllers.DeleteDoctorController;
import com.benediht.servicedoctor.services.impl.DeleteDoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
@Log4j2
public class DeleteDoctorControllerImpl implements DeleteDoctorController {

    private final DeleteDoctorServiceImpl service;

    @Override
    public ResponseEntity<Void> delete(Long id) {
        log.info("Request received!");
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}