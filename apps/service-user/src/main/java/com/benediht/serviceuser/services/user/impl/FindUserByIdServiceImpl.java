package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.exceptions.UserNotFoundException;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.FindUserByIdService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Valid
@RequiredArgsConstructor
@Log4j2
public class FindUserByIdServiceImpl implements FindUserByIdService {

    private final UserRepository repository;

    @Override
    public UserEntity findUserById(Long id) {
        try {
            log.info("Find User By Id Service ::: Received id: {}", id);
            UserEntity user = repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!"));
            log.info("Find User By Id Service ::: User found: {}", user);
            return user;
        }catch (Exception e){
            log.error("Find User By Id Service ::: Error: {}",e.getMessage());
            throw new RuntimeException(e);
        }
    }
}