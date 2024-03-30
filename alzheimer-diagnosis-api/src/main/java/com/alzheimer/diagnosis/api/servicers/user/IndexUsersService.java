package com.alzheimer.diagnosis.api.servicers.user;

import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;

import java.util.List;

public interface IndexUsersService {
    List<UserResponseDTO> indexUsers();
}