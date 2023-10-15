package com.api.prediction.services.user;

import com.api.prediction.models.dto.UserDTO;
import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.repositories.UserRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserService {

    @Autowired
    private UserRepository repository;

    public UserEntity update(UserDTO data, Long id){
        UserEntity userFromDB = findUserById(id);
        UserEntity userWithDataToUpdate = convertDTO(data);
        updateData(userWithDataToUpdate, userFromDB);
        userFromDB.setId(id);
        return repository.save(userFromDB );
    }

    public UserEntity convertDTO(UserDTO data){
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(data, user);
        return user;
    }

    public void updateData(UserEntity userToUpdate, UserEntity userFromDB){
        BeanUtils.copyProperties(userToUpdate, userFromDB);
    }

    public UserEntity findUserById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found!"));
    }
}