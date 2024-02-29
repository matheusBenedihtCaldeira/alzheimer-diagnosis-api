package com.benediht.serviceuser.services.user;

import com.benediht.serviceuser.models.dto.UserDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface UpdateUserService {

    void updateUser(@Valid @NotNull Long id, @NotNull UserDTO data);
}