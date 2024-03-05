package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.exceptions.DoctorNotFoundException;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.DeleteDoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class DeleteDoctorServiceImpl implements DeleteDoctorService {

    private final DoctorRepository repository;

    @Override
    public void delete(Long id) {
        log.error("Id received: {}", id);
        DoctorEntity doctor = findDoctorById(id);
        log.info("Doctor found!");
        repository.delete(doctor);
        log.info("Doctor deleted!");
    }

    private DoctorEntity findDoctorById(Long id) {
        return repository.findById(id).orElseThrow(() -> new DoctorNotFoundException("Doctor not found!"));
    }
}