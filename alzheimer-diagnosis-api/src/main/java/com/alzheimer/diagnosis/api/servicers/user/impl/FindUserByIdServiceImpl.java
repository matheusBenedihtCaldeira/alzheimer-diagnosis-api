package com.alzheimer.diagnosis.api.servicers.user.impl;

import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import com.alzheimer.diagnosis.api.models.mapper.UserMapper;
import com.alzheimer.diagnosis.api.repositories.UserRepository;
import com.alzheimer.diagnosis.api.servicers.user.FindUserByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindUserByIdServiceImpl implements FindUserByIdService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDTO findUserById(Long id) {
        UserEntity userEntity = repository.findById(id).get();
        return userMapper.userEntityToUserResponseDTO(userEntity);
    }
}