package com.api.prediction.services.user;

import com.api.prediction.models.entities.UserEntity;
import com.api.prediction.repositories.UserRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserService {

    @Autowired
    private UserRepository repository;

    public void delete(Long id){
        UserEntity user = findById(id);
        repository.deleteById(user.getId());
    }

    public UserEntity findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found!"));
    }
}