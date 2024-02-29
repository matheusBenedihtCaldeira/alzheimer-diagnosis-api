package com.benediht.servicedoctor.controllers;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeleteDoctorController {

    @DeleteMapping(value = "/delete/doctor/{id}")
    ResponseEntity<Void> delete(@Valid @NotNull @PathVariable Long id);
}