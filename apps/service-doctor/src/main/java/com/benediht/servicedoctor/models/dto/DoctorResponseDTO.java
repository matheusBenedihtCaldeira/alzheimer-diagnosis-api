package com.benediht.servicedoctor.models.dto;

public record DoctorResponseDTO(
        Long id,
        String firstName,
        String lastName,
        String crm,
        String email
) {}