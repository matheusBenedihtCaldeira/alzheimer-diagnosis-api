package com.api.prediction.services.patient;

import com.api.prediction.config.rest.RestTemplateConfig;
import com.api.prediction.models.dto.PredictionRequest;
import com.api.prediction.models.dto.PredictionResponse;
import com.api.prediction.models.entities.PatientEntity;
import com.api.prediction.repositories.PatientRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetDiagnosisService {

    @Autowired
    private PatientRepository repository;

    @Autowired
    private RestTemplateConfig restTemplate;

    String url = "http://localhost:5000/predict";

    public PatientEntity addDiagnosis(Long id, PredictionRequest data){
        PatientEntity patient = findById(id);
        String diagnosisResult = getDiagnosisResult(data);
        patient.setDiagnosis(String.valueOf(diagnosisResult ));
        return repository.save(patient);
    }

    public PredictionResponse prediction(PredictionRequest data){
        ResponseEntity<PredictionResponse> response = restTemplate.restTemplate().postForEntity(url, data, PredictionResponse.class);
        return response.getBody();
    }

    public PatientEntity findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Patient not found!"));
    }

    public String getDiagnosisResult(PredictionRequest data){
        PredictionResponse prediction = prediction(data);
        return prediction.result();
    }
}