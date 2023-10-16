package com.api.prediction.controllers.pacient;

import com.api.prediction.models.dto.PredictionRequest;
import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.services.pacient.GetDiagnosisService;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/pacient")
public class GetDiagnosisController {

    @Autowired
    private GetDiagnosisService service;

    @PostMapping(value = "/diagnosis/{id}")
    public ResponseEntity<PacientEntity> getDiagnosis(@PathVariable Long id, @RequestBody PredictionRequest data){
        PacientEntity pacient = service.addDiagnosis(id, data);
        return ResponseEntity.ok().body(pacient);
    }
}
