package com.benediht.serviceuser.services.user;

import jakarta.validation.constraints.NotBlank;

public interface DeleteUserService {

    void delete(@NotBlank Long id);
}