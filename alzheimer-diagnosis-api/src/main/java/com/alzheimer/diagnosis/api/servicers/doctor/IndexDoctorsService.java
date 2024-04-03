package com.alzheimer.diagnosis.api.servicers.doctor;

import com.alzheimer.diagnosis.api.models.dto.DoctorResponseDTO;

import java.util.List;

public interface IndexDoctorsService {

    List<DoctorResponseDTO> index();
}