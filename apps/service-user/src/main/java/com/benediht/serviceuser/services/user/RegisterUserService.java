package com.benediht.serviceuser.services.user;

import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.models.entities.UserEntity;

public interface RegisterUserService {
    UserEntity register(UserDTO data);
}