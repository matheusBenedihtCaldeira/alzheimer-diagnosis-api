package com.api.prediction.services.user;

import com.api.prediction.models.dto.UserDTO;
import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserService {

    @Autowired
    private UserRepository repository;

    public UserEntity update(UserDTO data, Long id){
        UserEntity userFromDB = repository.findById(id).get();
        UserEntity userWithDataToUpdate = convertDTO(data);
        BeanUtils.copyProperties(userWithDataToUpdate, userFromDB);
        userFromDB.setId(id);
        return repository.save(userFromDB );
    }

    public UserEntity convertDTO(UserDTO data){
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(data, user);
        return user;
    }
}