package com.api.prediction.services.patient;

import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindPatientByNameService {


    @Autowired
    private PatientRepository repository;

    public List<PatientEntity> findPatientByName(String name){
        List<PatientEntity> patients = repository.findByNameContainingIgnoreCase(name);
        return patients;
    }
}