package com.alzheimer.diagnosis.api.servicers.patient;

import com.alzheimer.diagnosis.api.models.dto.PatientDTO;
import com.alzheimer.diagnosis.api.models.entities.PatientEntity;

public interface RegisterPatientService {
    PatientEntity register(PatientDTO data);
}