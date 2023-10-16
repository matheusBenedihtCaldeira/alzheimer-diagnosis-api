package com.api.prediction.controllers.modelAPI;

import com.api.prediction.config.rest.RestTemplateConfig;
import com.api.prediction.models.dto.PredictionRequest;
import com.api.prediction.models.dto.PredictionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/prediction")
public class PredictionController {

    @Autowired
    private RestTemplateConfig restTemplate;

    String url = "http://localhost:5000/predict";
    @PostMapping
    public ResponseEntity<PredictionResponse> prediction(@RequestBody PredictionRequest data){
        ResponseEntity<PredictionResponse> response = restTemplate.restTemplate().postForEntity(url, data, PredictionResponse.class);
        PredictionResponse responseEntity = response.getBody();
        return ResponseEntity.ok().body(responseEntity);
    }
}
