package com.benediht.servicedoctor.services;

import com.benediht.servicedoctor.models.dto.DoctorDTO;

public interface UpdateDoctorService {

    void updateDoctor(Long id,DoctorDTO data);
}