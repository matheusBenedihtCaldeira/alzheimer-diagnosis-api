package com.api.prediction.services.user;

import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserService {

    @Autowired
    private UserRepository repository;

    public void delete(Long id){
        repository.deleteById(id);
    }
}