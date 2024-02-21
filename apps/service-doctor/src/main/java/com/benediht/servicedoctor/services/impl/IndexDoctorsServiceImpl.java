package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.IndexDoctorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndexDoctorsServiceImpl implements IndexDoctorsService {

    private final DoctorRepository repository;
    @Override
    public List<DoctorEntity> indexDoctors() {
        List<DoctorEntity> doctors = repository.findAll();
        return doctors;
    }
}