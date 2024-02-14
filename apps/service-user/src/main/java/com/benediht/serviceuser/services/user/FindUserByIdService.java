package com.benediht.serviceuser.services.user;

import com.benediht.serviceuser.models.entities.UserEntity;
import jakarta.validation.constraints.NotBlank;

public interface FindUserByIdService {

    UserEntity findUserById(@NotBlank Long id);
}