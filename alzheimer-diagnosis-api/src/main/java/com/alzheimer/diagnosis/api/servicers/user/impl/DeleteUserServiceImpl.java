package com.alzheimer.diagnosis.api.servicers.user.impl;

import com.alzheimer.diagnosis.api.exceptions.UserNotFoundException;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import com.alzheimer.diagnosis.api.repositories.UserRepository;
import com.alzheimer.diagnosis.api.servicers.user.DeleteUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class DeleteUserServiceImpl implements DeleteUserService {

    private final UserRepository repository;
    @Override
    public void delete(Long id) {
        UserEntity user = findUserById(id);
        log.info("User deleted!");
        repository.delete(user);
    }

    private UserEntity findUserById(long id){
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!"));
    }
}