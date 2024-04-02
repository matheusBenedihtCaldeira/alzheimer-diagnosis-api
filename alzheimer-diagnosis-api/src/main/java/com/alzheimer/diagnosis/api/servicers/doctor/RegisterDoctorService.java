package com.alzheimer.diagnosis.api.servicers.doctor;

import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;

public interface RegisterDoctorService {

    DoctorEntity register(DoctorDTO data);
}