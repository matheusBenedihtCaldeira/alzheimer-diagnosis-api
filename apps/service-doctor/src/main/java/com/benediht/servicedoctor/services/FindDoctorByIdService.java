package com.benediht.servicedoctor.services;

import com.benediht.servicedoctor.models.dto.FindDoctorByIdResponseDTO;

public interface FindDoctorByIdService {

    FindDoctorByIdResponseDTO findDoctorById(Long id);
}