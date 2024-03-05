package com.benediht.serviceuser.services.user.impl;

import com.benediht.serviceuser.exceptions.UserNotFoundException;
import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.models.mapper.UserMapper;
import com.benediht.serviceuser.repositories.UserRepository;
import com.benediht.serviceuser.services.user.UpdateUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UpdateUserServiceImpl implements UpdateUserService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public void updateUser(Long id, UserDTO data) {
        UserEntity userFromDB = findUser(id);
        UserEntity userWithDataToUpdate = userMapper.userDtoToUserEntity(data);
        updateData(userWithDataToUpdate, userFromDB);
        repository.save(userFromDB);
    }

    private void updateData(UserEntity dataToUpdate, UserEntity dataFromDB){
        dataToUpdate.setId(dataFromDB.getId());
        dataToUpdate.setCreatedAt(dataFromDB.getCreatedAt());
        BeanUtils.copyProperties(dataToUpdate, dataFromDB);
    }
    private UserEntity findUser(Long id){
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!"));
    }
}