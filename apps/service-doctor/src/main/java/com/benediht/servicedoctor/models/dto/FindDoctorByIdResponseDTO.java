package com.benediht.servicedoctor.models.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record FindDoctorByIdResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String crm,
        String email,
        String cellphone
) {}