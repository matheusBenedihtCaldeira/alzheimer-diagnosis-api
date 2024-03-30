package com.alzheimer.diagnosis.api.models.dto;

import com.alzheimer.diagnosis.api.models.enums.Role;

import java.time.LocalDateTime;

public record UserResponseDTO(
    Long id,
    String firstName,
    String lastName,
    String email,
    Role role,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {}