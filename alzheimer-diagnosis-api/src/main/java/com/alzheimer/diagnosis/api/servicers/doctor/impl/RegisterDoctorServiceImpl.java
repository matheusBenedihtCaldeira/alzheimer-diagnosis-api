package com.alzheimer.diagnosis.api.servicers.doctor.impl;

import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import com.alzheimer.diagnosis.api.models.mapper.DoctorMapper;
import com.alzheimer.diagnosis.api.repositories.DoctorRepository;
import com.alzheimer.diagnosis.api.servicers.doctor.RegisterDoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class RegisterDoctorServiceImpl implements RegisterDoctorService {

    private final DoctorRepository repository;
    private final DoctorMapper doctorMapper;

    @Override
    public DoctorEntity register(DoctorDTO data) {
        log.info("Data received: {}", data);
        DoctorEntity doctorEntity = doctorMapper.doctorDtoToDoctorEntity(data);
        log.info("Data converted to DTO: {}", doctorEntity);
        DoctorEntity savedDoctor = repository.save(doctorEntity);
        log.info("Doctor successfully registered!");
        return savedDoctor;
    }
}