package com.alzheimer.diagnosis.api.servicers.user.impl;

import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import com.alzheimer.diagnosis.api.models.mapper.UserMapper;
import com.alzheimer.diagnosis.api.repositories.UserRepository;
import com.alzheimer.diagnosis.api.servicers.user.RegisterUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class RegisterUserServiceImpl implements RegisterUserService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public UserEntity register(UserDTO data) {
        log.info("Data received: {}", data);
        UserEntity user = userMapper.userDtoToUserEntity(data);
        log.info("Data converted: {}", user);
        UserEntity savedUser = repository.save(user);
        log.info("User successfully registered!");
        return savedUser;
    }
}