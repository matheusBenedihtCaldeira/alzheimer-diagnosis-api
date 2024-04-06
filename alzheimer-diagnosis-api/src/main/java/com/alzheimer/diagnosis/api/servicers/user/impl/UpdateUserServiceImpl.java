package com.alzheimer.diagnosis.api.servicers.user.impl;

import com.alzheimer.diagnosis.api.exceptions.EmailAlreadyInUseException;
import com.alzheimer.diagnosis.api.exceptions.UserNotFoundException;
import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import com.alzheimer.diagnosis.api.models.mapper.UserMapper;
import com.alzheimer.diagnosis.api.repositories.UserRepository;
import com.alzheimer.diagnosis.api.servicers.user.UpdateUserService;
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
    public void update(Long id, UserDTO data) {
        if(emailAlreadyInUser(data.email())) throw new EmailAlreadyInUseException("E-mail already in use!");
        UserEntity userFromDB = findUserById(id);
        UserEntity userWithDataToUpdate = userMapper.userDtoToUserEntity(data);
        updateData(userWithDataToUpdate, userFromDB);
        repository.save(userFromDB);
        log.info("User updated!");
    }

    private void updateData(UserEntity userWithDataToUpdate, UserEntity userFromDB){
        userWithDataToUpdate.setId(userFromDB.getId());
        userWithDataToUpdate.setCreatedAt(userFromDB.getCreatedAt());
        BeanUtils.copyProperties(userWithDataToUpdate, userFromDB);
    }

    private UserEntity findUserById(Long id){
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!"));
    }

    private boolean emailAlreadyInUser(String email){
        return repository.findByEmail(email).isPresent();
    }
}