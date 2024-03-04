package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.exceptions.UserNotFoundException;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.DeleteUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class DeleteUserServiceImpl implements DeleteUserService {

    private final UserRepository repository;

    @Override
    public void delete(Long id) {
        UserEntity user = findUserById(id);
        log.info("Deleting user with id: {}", user.getId());
        repository.delete(user);
    }

    private UserEntity findUserById(Long id){
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!"));
    }
}