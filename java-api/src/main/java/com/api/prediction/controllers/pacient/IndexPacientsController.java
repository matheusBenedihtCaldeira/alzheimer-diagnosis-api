package com.api.prediction.controllers.pacient;

import com.api.prediction.models.entities.PacientEntity;
import com.api.prediction.services.pacient.IndexPacientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/pacients")
public class IndexPacientsController {

    @Autowired
    private IndexPacientsService service;

    @GetMapping
    public ResponseEntity<List<PacientEntity>> index(){
        List<PacientEntity> pacients = service.index();
        return ResponseEntity.ok().body(pacients);
    }
}