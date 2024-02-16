package com.benediht.serviceuser.services.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public interface DeleteUserService {

    void delete(@NotNull Long id);
}