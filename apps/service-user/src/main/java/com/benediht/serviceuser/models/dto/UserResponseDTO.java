package com.benediht.serviceuser.models.dto;

import com.benediht.serviceuser.models.enums.Role;

public record UserResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String email,
        Role role
){}