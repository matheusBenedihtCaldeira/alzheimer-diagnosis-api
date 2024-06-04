package com.alzheimer.diagnosis.api.repositories;

import com.alzheimer.diagnosis.api.models.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {
}