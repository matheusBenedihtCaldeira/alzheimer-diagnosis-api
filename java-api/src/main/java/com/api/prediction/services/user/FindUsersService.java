package com.api.prediction.services.user;

import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindUsersService {

    @Autowired
    private UserRepository repository;

    public List<UserEntity> findUsers(){
        List<UserEntity> users = repository.findAll();
        return users;
    }
}