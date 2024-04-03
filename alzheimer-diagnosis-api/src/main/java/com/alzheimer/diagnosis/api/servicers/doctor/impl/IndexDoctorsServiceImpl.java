package com.alzheimer.diagnosis.api.servicers.doctor.impl;

import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import com.alzheimer.diagnosis.api.models.mapper.DoctorMapper;
import com.alzheimer.diagnosis.api.repositories.DoctorRepository;
import com.alzheimer.diagnosis.api.servicers.doctor.IndexDoctorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndexDoctorsServiceImpl implements IndexDoctorsService {

    private final DoctorRepository repository;
    private final DoctorMapper mapper;
    @Override
    public List<DoctorResponseDTO> index() {
        List<DoctorEntity> doctorEntities = repository.findAll();
        return doctorEntities.stream().map(mapper::doctorEntityToDoctorResponse).toList();
    }
}