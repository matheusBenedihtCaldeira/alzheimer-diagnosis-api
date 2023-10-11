package com.api.prediction.services.pacient;

import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.repositories.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexPacientsService {

    @Autowired
    private PacientRepository repository;

    public List<PacientEntity> index(){
        List<PacientEntity> pacients = repository.findAll();
        return pacients;
    }
}