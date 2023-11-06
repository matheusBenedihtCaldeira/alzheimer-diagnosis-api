package com.api.prediction.models.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Date;

public record PatientDTO(@NotBlank String name, @NotBlank String cpf, @NotBlank LocalDate dateOfBirth, @NotBlank char gender) {
}