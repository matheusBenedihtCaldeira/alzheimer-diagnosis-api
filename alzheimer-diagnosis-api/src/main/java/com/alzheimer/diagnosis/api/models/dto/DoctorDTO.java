package com.alzheimer.diagnosis.api.models.dto;

import com.alzheimer.diagnosis.api.models.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DoctorDTO(
        Long id,
        @NotBlank String firstName,
        @NotBlank String lastName,
        @NotBlank String crm,
        @NotBlank @Email String email,
        @NotNull Role role,
        @NotBlank String password
){}