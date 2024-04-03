package com.alzheimer.diagnosis.api.models.dto;

import com.alzheimer.diagnosis.api.models.enums.Role;

public record DoctorResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String crm,
        String email,
        Role role
) {}