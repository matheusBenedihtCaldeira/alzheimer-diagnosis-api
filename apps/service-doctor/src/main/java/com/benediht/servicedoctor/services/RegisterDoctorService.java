package com.benediht.servicedoctor.services;

import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import jakarta.validation.constraints.NotNull;

public interface RegisterDoctorService {
    DoctorEntity register(@NotNull DoctorDTO data);
}