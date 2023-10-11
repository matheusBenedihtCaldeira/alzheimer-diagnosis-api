package com.api.prediction.services.pacient;

import com.api.prediction.models.dto.PacientDTO;
import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.repositories.PacientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterPacientService {

    @Autowired
    private PacientRepository repository;

    public PacientEntity register(PacientDTO data){
        PacientEntity paciet = convertDTO(data);
        return repository.save(paciet);
    }

    public PacientEntity convertDTO(PacientDTO data){
        PacientEntity pacient = new PacientEntity();
        BeanUtils.copyProperties(data, pacient);
        return pacient;
    }
}