package com.benediht.serviceuser.services.user;

import com.benediht.serviceuser.models.dto.FindUserByIdResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface FindUserByIdService {

    FindUserByIdResponseDTO findUserById(@Valid @NotNull Long id);
}