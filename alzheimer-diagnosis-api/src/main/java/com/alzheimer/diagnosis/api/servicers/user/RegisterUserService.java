package com.alzheimer.diagnosis.api.servicers.user;

import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;

public interface RegisterUserService {

    UserEntity register(UserDTO data);
}