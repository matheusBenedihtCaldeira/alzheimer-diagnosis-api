package com.alzheimer.diagnosis.api.servicers.doctor.impl;

import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import com.alzheimer.diagnosis.api.models.mapper.DoctorMapper;
import com.alzheimer.diagnosis.api.repositories.DoctorRepository;
import com.alzheimer.diagnosis.api.servicers.doctor.FindDoctorByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindDoctorByIdServiceImpl implements FindDoctorByIdService {

    private final DoctorRepository repository;
    private final DoctorMapper mapper;

    @Override
    public DoctorResponseDTO findDoctorById(Long id) {
        DoctorEntity doctorEntity = repository.findById(id).get();
        return mapper.doctorEntityToDoctorResponse(doctorEntity);
    }
}