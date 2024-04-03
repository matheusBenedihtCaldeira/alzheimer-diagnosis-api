package com.alzheimer.diagnosis.api.servicers.doctor;

import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;

public interface UpdateDoctorService {

    void update(Long id, DoctorDTO data);
}