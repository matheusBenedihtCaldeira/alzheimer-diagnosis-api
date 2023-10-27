package com.api.prediction.repositories;

import com.api.prediction.models.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
    PatientEntity findPatientByCpf(String cpf);
}