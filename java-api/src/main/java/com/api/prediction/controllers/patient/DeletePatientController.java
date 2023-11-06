package com.api.prediction.controllers.patient;

import com.api.prediction.services.patient.DeletePatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/delete")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DeletePatientController {

    @Autowired
    private DeletePatientService service;

    @DeleteMapping(value = "/patient/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}