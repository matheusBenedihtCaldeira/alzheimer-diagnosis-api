package com.benediht.serviceuser.services.user;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface DeleteUserService {

    void delete(@Valid @NotNull Long id);
}