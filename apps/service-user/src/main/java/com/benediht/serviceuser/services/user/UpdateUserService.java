package com.benediht.serviceuser.services.user;

import com.benediht.serviceuser.models.dto.UserDTO;

public interface UpdateUserService {

    void updateUser(Long id, UserDTO data);
}