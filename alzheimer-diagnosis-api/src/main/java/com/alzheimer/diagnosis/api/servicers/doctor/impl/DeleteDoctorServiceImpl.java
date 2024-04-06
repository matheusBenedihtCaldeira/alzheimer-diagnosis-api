package com.alzheimer.diagnosis.api.servicers.doctor.impl;

import com.alzheimer.diagnosis.api.exceptions.DoctorNotFoundException;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import com.alzheimer.diagnosis.api.repositories.DoctorRepository;
import com.alzheimer.diagnosis.api.servicers.doctor.DeleteDoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class DeleteDoctorServiceImpl implements DeleteDoctorService {

    private final DoctorRepository repository;
    @Override
    public void delete(Long id) {
        DoctorEntity doctor = findDoctorById(id);
        repository.delete(doctor);
        log.info("Doctor deleted!");
    }

    private DoctorEntity findDoctorById(Long id){
        return repository.findById(id).orElseThrow(() -> new DoctorNotFoundException("Doctor not found!"));
    }
}