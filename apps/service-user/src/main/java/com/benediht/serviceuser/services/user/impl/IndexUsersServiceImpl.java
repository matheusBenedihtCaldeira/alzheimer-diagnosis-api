package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.models.dto.UserResponseDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.models.mapper.UserMapper;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.IndexUsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2
public class IndexUsersServiceImpl implements IndexUsersService {

    private final UserRepository repository;
    private final UserMapper mapper;
    @Override
    public List<UserResponseDTO> indexUsers() {
        log.info("Index users service ::: Listing users");
        List<UserEntity> users = repository.findAll();
        List<UserResponseDTO> usersDTO = users.stream().map(mapper::userEntityToUserResponse).toList();
        return usersDTO;
    }
}