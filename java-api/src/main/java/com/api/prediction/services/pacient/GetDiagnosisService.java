package com.api.prediction.services.pacient;

import com.api.prediction.config.rest.RestTemplateConfig;
import com.api.prediction.models.dto.PredictionRequest;
import com.api.prediction.models.dto.PredictionResponse;
import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.repositories.PacientRepository;
import com.api.prediction.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetDiagnosisService {

    @Autowired
    private PacientRepository repository;

    @Autowired
    private RestTemplateConfig restTemplate;

    String url = "http://localhost:5000/predict";

    public PacientEntity addDiagnosis(Long id, PredictionRequest data){
        PacientEntity pacient = findById(id);
        PredictionResponse prediction = prediction(data);
        String diagnosisResult = prediction.result();
        pacient.setDiagnosis(String.valueOf(diagnosisResult ));
        return repository.save(pacient);
    }

    public PredictionResponse prediction(PredictionRequest data){
        ResponseEntity<PredictionResponse> response = restTemplate.restTemplate().postForEntity(url, data, PredictionResponse.class);
        return response.getBody();
    }

    public PacientEntity findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Pacient not found!"));
    }
}