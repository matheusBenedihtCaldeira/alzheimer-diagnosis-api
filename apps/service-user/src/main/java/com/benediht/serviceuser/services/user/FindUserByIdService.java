package com.benediht.serviceuser.services.user;

import com.benediht.serviceuser.models.entities.UserEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public interface FindUserByIdService {

    UserEntity findUserById(@NotNull Long id);
}