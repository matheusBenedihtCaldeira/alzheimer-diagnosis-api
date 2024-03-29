package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.exceptions.DoctorNotFoundException;
import com.benediht.servicedoctor.models.dto.DoctorResponseDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.models.mapper.DoctorMapper;
import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.FindDoctorByIdService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class FindDoctorByIdServiceImpl implements FindDoctorByIdService {

    private final DoctorRepository repository;
    private final DoctorMapper mapper;
    @Override
    public DoctorResponseDTO findDoctorById(Long id) {
        log.info("Received id: {}", id);
        DoctorEntity doctor = repository.findById(id).orElseThrow(() -> new DoctorNotFoundException("Doctor not found!"));
        DoctorResponseDTO doctorDTO = mapper.doctorEntityToDoctorDTO(doctor);
        log.info("Doctor found: {}", doctorDTO);
        return doctorDTO;

    }
}