package com.api.prediction.services.patient;

import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.repositories.PatientRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePatientService {

    @Autowired
    private PatientRepository repository;

    public void delete(Long id){
        PatientEntity patient = findById(id);
        repository.delete(patient);
    }

    public PatientEntity findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Patient not found!"));
    }
}