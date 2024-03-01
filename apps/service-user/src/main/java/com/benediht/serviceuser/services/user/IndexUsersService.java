package com.benediht.serviceuser.services.user;

import com.benediht.serviceuser.models.dto.UserResponseDTO;

import java.util.List;

public interface IndexUsersService {

    List<UserResponseDTO> indexUsers();
}