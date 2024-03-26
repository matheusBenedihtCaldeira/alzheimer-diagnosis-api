package com.alzheimer.diagnosis.api.models.dto;

import com.alzheimer.diagnosis.api.models.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(
        Long id,
        @NotBlank String firtsName,
        @NotBlank String lastName,
        @NotBlank @Email String email,
        @NotNull Role role,
        @NotBlank String password
) {
}