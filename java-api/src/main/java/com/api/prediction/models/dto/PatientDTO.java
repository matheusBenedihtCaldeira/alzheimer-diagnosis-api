package com.api.prediction.models.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record PatientDTO(@NotBlank String name, @NotBlank String cpf, @NotBlank Date dateOfBirth, @NotBlank char gender) {
}