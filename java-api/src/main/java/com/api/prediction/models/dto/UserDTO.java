package com.api.prediction.models.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserDTO(Long id, @NotBlank String name, @NotBlank @Email String email, @NotBlank String password) {
}

