package com.api.prediction.services.user;

import com.api.prediction.models.dto.UserDTO;
import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    @Autowired
    private UserRepository repository;

    public UserEntity register(UserDTO data){
        UserEntity user = convertDTO(data);
        user.setPassword(encryptPassword(user.getPassword()));
        return repository.save(user);
    }

    public UserEntity convertDTO(UserDTO data){
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(data, user);
        return user;
    }

    public String encryptPassword(String password){
        String encryptedPassword = new BCryptPasswordEncoder().encode(password);
        return encryptedPassword;
    }
}