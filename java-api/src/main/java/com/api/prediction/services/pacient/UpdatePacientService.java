package com.api.prediction.services.pacient;

import com.api.prediction.models.dto.PacientDTO;
import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.repositories.PacientRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import jakarta.persistence.Basic;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdatePacientService {

    @Autowired
    private PacientRepository repository;

    public PacientEntity update(Long id, PacientDTO dataToUpdate){
        PacientEntity pacientFromDB = findPacientById(id);
        PacientEntity pacientToUpdate = convertDTO(dataToUpdate);
        pacientToUpdate.setId(id);
        updateData(pacientToUpdate, pacientFromDB);
        return repository.save(pacientFromDB);
    }

    public PacientEntity findPacientById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Pacient not found!"));
    }

    public PacientEntity convertDTO(PacientDTO dataDTO){
        PacientEntity pacient = new PacientEntity();
        BeanUtils.copyProperties(dataDTO, pacient);
        return pacient;
    }

    public void updateData(PacientEntity dataToUpdate, PacientEntity dataFromDB){
        BeanUtils.copyProperties(dataToUpdate, dataFromDB);
    }
}