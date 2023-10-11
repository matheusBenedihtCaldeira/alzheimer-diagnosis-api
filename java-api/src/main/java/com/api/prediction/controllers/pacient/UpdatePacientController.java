package com.api.prediction.controllers.pacient;

import com.api.prediction.models.dto.PacientDTO;
import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.services.pacient.UpdatePacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/update")
public class UpdatePacientController {

    @Autowired
    private UpdatePacientService service;

    @PutMapping(value = "/pacient/{id}")
    public ResponseEntity<PacientEntity> update(@PathVariable Long id, @RequestBody PacientDTO data){
        PacientEntity pacient = service.update(id, data);
        return ResponseEntity.ok().body(pacient);
    }
}