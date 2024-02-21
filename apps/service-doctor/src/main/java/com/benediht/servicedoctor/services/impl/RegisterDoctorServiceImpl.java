package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.RegisterDoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterDoctorServiceImpl implements RegisterDoctorService {

    private final DoctorRepository repository;

    @Override
    public DoctorEntity register(DoctorDTO data) {
        DoctorEntity doctor = convertDTO(data);
        return repository.save(doctor);
    }

    private DoctorEntity convertDTO(DoctorDTO data){
        DoctorEntity doctorEntity = new DoctorEntity();
        BeanUtils.copyProperties(data, doctorEntity);
        return doctorEntity;
    }
}