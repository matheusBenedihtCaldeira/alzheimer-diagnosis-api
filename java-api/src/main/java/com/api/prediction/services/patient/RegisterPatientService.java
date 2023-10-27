package com.api.prediction.services.patient;

import com.api.prediction.models.dto.PatientDTO;
import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.repositories.PatientRepository;
import com.api.prediction.services.exceptions.UserAlredyExistsException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterPatientService {

    @Autowired
    private PatientRepository repository;

    public PatientEntity register(PatientDTO data){
        patientAlredyExist(data.cpf());
        PatientEntity paciet = convertDTO(data);
        return repository.save(paciet);
    }

    public PatientEntity convertDTO(PatientDTO data){
        PatientEntity patient = new PatientEntity();
        BeanUtils.copyProperties(data, patient);
        return patient;
    }

    public void patientAlredyExist(String cpf){
        PatientEntity patient = repository.findPatientByCpf(cpf);
        if(patient != null){
            throw new UserAlredyExistsException("Patient alredy exist with CPF: " + cpf);
        }
    }
}