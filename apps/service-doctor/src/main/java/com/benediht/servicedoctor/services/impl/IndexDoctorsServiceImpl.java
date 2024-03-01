package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.models.dto.DoctorResponseDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.models.mapper.DoctorMapper;
import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.IndexDoctorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndexDoctorsServiceImpl implements IndexDoctorsService {

    private final DoctorRepository repository;
    private final DoctorMapper mapper;
    @Override
    public List<DoctorResponseDTO> indexDoctors() {
        List<DoctorEntity> doctors = repository.findAll();
        List<DoctorResponseDTO> doctorsDTO = doctors.stream().map(mapper::doctorEntityToDoctorDTO).toList();
        return doctorsDTO;
    }
}