package com.benediht.servicedoctor.services;

import com.benediht.servicedoctor.models.dto.DoctorResponseDTO;

public interface FindDoctorByIdService {

    DoctorResponseDTO findDoctorById(Long id);
}