package com.alzheimer.diagnosis.api.servicers.user.impl;

import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import com.alzheimer.diagnosis.api.models.mapper.UserMapper;
import com.alzheimer.diagnosis.api.repositories.UserRepository;
import com.alzheimer.diagnosis.api.servicers.user.IndexUsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndexUsersServiceImpl implements IndexUsersService {

    private final UserRepository repository;
    private final UserMapper userMapper;
    @Override
    public List<UserResponseDTO> indexUsers() {
        List<UserEntity> usersEntities = repository.findAll();
        return usersEntities.stream().map(userMapper::userEntityToUserResponseDTO).toList();
    }
}