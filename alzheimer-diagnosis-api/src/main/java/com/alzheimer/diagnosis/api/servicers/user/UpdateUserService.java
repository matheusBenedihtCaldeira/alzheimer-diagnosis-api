package com.alzheimer.diagnosis.api.servicers.user;

import com.alzheimer.diagnosis.api.models.dto.UserDTO;

public interface UpdateUserService {
    void update(Long id, UserDTO data);
}