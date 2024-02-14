package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.DeleteUserService;
import com.benediht.serviceuser.services.user.FindUserByIdService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Valid
@RequiredArgsConstructor
@Log4j2
public class DeleteUserServiceImpl implements DeleteUserService {

    private final UserRepository repository;
    private final FindUserByIdService findUserByIdService;

    @Override
    public void delete(Long id) {
        UserEntity user = findUserByIdService.findUserById(id);
        repository.delete(user);
        log.info("Delete User Service ::: Deleting user with id: {}", user.getId());
    }
}