package com.alzheimer.diagnosis.api.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record PatientDTO(
        Long id,
        @NotBlank
        String firstName,
        @NotBlank
        String lastName,
        @NotBlank
        String cpf,
        @NotNull
        char gender,
        @NotNull
        LocalDate dateOfBirth,
        String diagnosis
) {
}