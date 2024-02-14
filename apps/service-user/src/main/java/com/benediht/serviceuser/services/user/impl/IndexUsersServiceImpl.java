package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.IndexUsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class IndexUsersServiceImpl implements IndexUsersService {

    private final UserRepository repository;
    @Override
    public List<UserEntity> indexUsers() {
        log.info("Index users service ::: Listing users");
        return repository.findAll();
    }
}