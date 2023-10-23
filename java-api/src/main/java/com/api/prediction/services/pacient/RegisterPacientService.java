package com.api.prediction.services.pacient;

import com.api.prediction.models.dto.PacientDTO;
import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.repositories.PacientRepository;
import com.api.prediction.services.exceptions.UserAlredyExistsException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterPacientService {

    @Autowired
    private PacientRepository repository;

    public PacientEntity register(PacientDTO data){
        pacientAlredyExist(data.cpf());
        PacientEntity paciet = convertDTO(data);
        return repository.save(paciet);
    }

    public PacientEntity convertDTO(PacientDTO data){
        PacientEntity pacient = new PacientEntity();
        BeanUtils.copyProperties(data, pacient);
        return pacient;
    }

    public void pacientAlredyExist(String cpf){
        PacientEntity pacient = repository.findPacientByCpf(cpf);
        if(pacient != null){
            throw new UserAlredyExistsException("Pacient alredy exist with CPF: " + cpf);
        }
    }
}