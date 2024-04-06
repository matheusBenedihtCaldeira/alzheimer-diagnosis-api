package com.alzheimer.diagnosis.api.servicers.doctor.impl;

import com.alzheimer.diagnosis.api.exceptions.DoctorNotFoundException;
import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import com.alzheimer.diagnosis.api.models.mapper.DoctorMapper;
import com.alzheimer.diagnosis.api.repositories.DoctorRepository;
import com.alzheimer.diagnosis.api.servicers.doctor.FindDoctorByIdService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FindDoctorByIdServiceImpl implements FindDoctorByIdService {

    private final DoctorRepository repository;
    private final DoctorMapper mapper;

    @Override
    public DoctorResponseDTO findDoctorById(Long id) {
        DoctorEntity doctorEntity = repository.findById(id).orElseThrow(() -> new DoctorNotFoundException("Doctor not found!"));
        log.info("Doctor found!");
        return mapper.doctorEntityToDoctorResponse(doctorEntity);
    }
}