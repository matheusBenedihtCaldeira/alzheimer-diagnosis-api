package com.alzheimer.diagnosis.api.servicers.user.impl;

import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import com.alzheimer.diagnosis.api.models.mapper.UserMapper;
import com.alzheimer.diagnosis.api.repositories.UserRepository;
import com.alzheimer.diagnosis.api.servicers.user.UpdateUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserServiceImpl implements UpdateUserService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public void update(Long id, UserDTO data) {
        UserEntity userFromDB = findUserById(id);
        UserEntity userWithDataToUpdate = userMapper.userDtoToUserEntity(data);
        updateData(userWithDataToUpdate, userFromDB);
        repository.save(userFromDB);
    }

    private void updateData(UserEntity userWithDataToUpdate, UserEntity userFromDB){
        userWithDataToUpdate.setId(userFromDB.getId());
        userWithDataToUpdate.setCreatedAt(userFromDB.getCreatedAt());
        BeanUtils.copyProperties(userWithDataToUpdate, userFromDB);
    }

    private UserEntity findUserById(Long id){
        return repository.findById(id).get();
    }
}