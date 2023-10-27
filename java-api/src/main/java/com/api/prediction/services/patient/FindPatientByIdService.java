package com.api.prediction.services.patient;

import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.repositories.PatientRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindPatientByIdService {

    @Autowired
    private PatientRepository repository;

    public PatientEntity findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Patient not found!"));
    }
}