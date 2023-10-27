package com.api.prediction.services.patient;

import com.api.prediction.models.dto.PatientDTO;
import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.repositories.PatientRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdatePatientService {

    @Autowired
    private PatientRepository repository;

    public PatientEntity update(Long id, PatientDTO dataToUpdate){
        PatientEntity patientFromDB = findPatientById(id);
        PatientEntity patientToUpdate = convertDTO(dataToUpdate);
        patientToUpdate.setId(id);
        updateData(patientToUpdate, patientFromDB);
        return repository.save(patientFromDB);
    }

    public PatientEntity findPatientById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Patient not found!"));
    }

    public PatientEntity convertDTO(PatientDTO dataDTO){
        PatientEntity patient = new PatientEntity();
        BeanUtils.copyProperties(dataDTO, patient);
        return patient;
    }

    public void updateData(PatientEntity dataToUpdate, PatientEntity dataFromDB){
        BeanUtils.copyProperties(dataToUpdate, dataFromDB);
    }
}