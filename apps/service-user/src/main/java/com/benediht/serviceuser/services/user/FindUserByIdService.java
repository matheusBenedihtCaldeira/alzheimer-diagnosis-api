package com.benediht.serviceuser.services.user;

import com.benediht.serviceuser.models.dto.UserResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface FindUserByIdService {

    UserResponseDTO findUserById(@Valid @NotNull Long id);
}