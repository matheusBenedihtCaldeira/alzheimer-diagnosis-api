package com.api.prediction.repositories;

import com.api.prediction.models.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
    PatientEntity findPatientByCpf(String cpf);
    List<PatientEntity> findByNameContainingIgnoreCase(String name);
    List<PatientEntity> findByDiagnosisIgnoreCase(String diagnosis);
}