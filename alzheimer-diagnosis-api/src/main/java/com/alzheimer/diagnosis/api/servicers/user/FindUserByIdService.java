package com.alzheimer.diagnosis.api.servicers.user;

import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;

public interface FindUserByIdService {

    UserResponseDTO findUserById(Long id);
}