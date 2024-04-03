package com.alzheimer.diagnosis.api.servicers.doctor;

import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;

public interface FindDoctorByIdService {

    DoctorResponseDTO findDoctorById(Long id);
}