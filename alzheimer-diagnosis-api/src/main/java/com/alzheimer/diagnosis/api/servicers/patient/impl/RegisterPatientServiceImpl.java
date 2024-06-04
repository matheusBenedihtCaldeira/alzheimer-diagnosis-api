package com.alzheimer.diagnosis.api.servicers.patient.impl;

import com.alzheimer.diagnosis.api.models.dto.PatientDTO;
import com.alzheimer.diagnosis.api.models.entities.PatientEntity;
import com.alzheimer.diagnosis.api.models.mapper.PatientMapper;
import com.alzheimer.diagnosis.api.repositories.PatientRepository;
import com.alzheimer.diagnosis.api.servicers.patient.RegisterPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterPatientServiceImpl implements RegisterPatientService {

    private final PatientRepository repository;
    private final PatientMapper mapper;

    @Override
    public PatientEntity register(PatientDTO data) {
        PatientEntity patient = mapper.patientDtoToPatientEntity(data);
        return repository.save(patient);
    }
}