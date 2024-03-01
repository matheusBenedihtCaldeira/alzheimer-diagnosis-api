package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.exceptions.UserNotFoundException;
import com.benediht.serviceuser.models.dto.UserResponseDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.models.mapper.UserMapper;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.FindUserByIdService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class FindUserByIdServiceImpl implements FindUserByIdService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDTO findUserById(Long id) {
        try {
            log.info("Received id: {}", id);
            UserEntity user = repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!"));
            UserResponseDTO userDTO = userMapper.userEntityToUserResponse(user);
            log.info("User found: {}", userDTO);
            return userDTO;
        }catch (Exception e){
            log.error("Error: {}",e.getMessage());
            throw new RuntimeException(e);
        }
    }
}