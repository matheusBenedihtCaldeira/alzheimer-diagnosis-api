package com.benediht.servicedoctor.models.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DoctorDTO(
        Long id,
        @NotBlank String firstName,
        @NotBlank String lastName,
        @NotBlank String crm,
        @NotBlank @Email String email,
        @NotBlank String password
) {}