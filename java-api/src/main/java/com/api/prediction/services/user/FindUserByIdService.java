package com.api.prediction.services.user;

import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindUserByIdService {

    @Autowired
    private UserRepository repository;

    public UserEntity findById(Long id){
        UserEntity user = repository.findById(id).get();
        return user;
    }
}