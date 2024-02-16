package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.UpdateUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
@Valid
public class UpdateUserServiceImpl implements UpdateUserService {

    private final UserRepository repository;
    private final FindUserByIdServiceImpl findUserByIdService;

    @Override
    public void updateUser(Long id, UserDTO data) {
        UserEntity userWithDataToUpdate = convertDTO(data);
        UserEntity userFromDB = findUserByIdService.findUserById(id);
        updateData(userWithDataToUpdate, userFromDB);
        repository.save(userFromDB);
    }

    private void updateData(UserEntity dataToUpdate, UserEntity dataFromDB){
        dataToUpdate.setId(dataFromDB.getId());
        dataToUpdate.setCreatedAt(dataFromDB.getCreatedAt());
        BeanUtils.copyProperties(dataToUpdate, dataFromDB);
    }
    private UserEntity convertDTO(UserDTO data){
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(data, user);
        return user;
    }
}