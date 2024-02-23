package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.exceptions.UserAlreadyExistsException;
import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.models.mapper.UserMapper;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.RegisterUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class RegisterUserServiceImpl implements RegisterUserService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public UserEntity register(UserDTO data) {
        try{
            if(emailAlredyRegistered(data.email())) throw new UserAlreadyExistsException("E-mail already in use");
            log.info("Registering new user {}", data);
            UserEntity user = userMapper.userDtoToUserEntity(data);
            UserEntity savedUser = repository.save(user);
            log.info("User saved successfully, user id: {}", savedUser.getId());
            return savedUser;
        }catch (Exception e){
            log.error("Register user service ::: Error registering user: {}", e.getMessage());
            throw new RuntimeException("Error registering user:", e);
        }
    }

    private boolean emailAlredyRegistered(String email){
        return repository.findUserByEmail(email).isPresent();
    }
}