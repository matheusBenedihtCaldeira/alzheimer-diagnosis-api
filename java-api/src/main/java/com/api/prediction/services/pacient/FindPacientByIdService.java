package com.api.prediction.services.pacient;

import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.repositories.PacientRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindPacientByIdService {

    @Autowired
    private PacientRepository repository;

    public PacientEntity findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Pacient not found!"));
    }
}