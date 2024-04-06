package com.alzheimer.diagnosis.api.servicers.user.impl;

import com.alzheimer.diagnosis.api.exceptions.UserNotFoundException;
import com.alzheimer.diagnosis.api.models.dto.UserResponseDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import com.alzheimer.diagnosis.api.models.mapper.UserMapper;
import com.alzheimer.diagnosis.api.repositories.UserRepository;
import com.alzheimer.diagnosis.api.servicers.user.FindUserByIdService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class FindUserByIdServiceImpl implements FindUserByIdService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDTO findUserById(Long id) {
        UserEntity userEntity = repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!"));
        log.info("User founded!");
        return userMapper.userEntityToUserResponseDTO(userEntity);
    }
}