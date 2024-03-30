package com.alzheimer.diagnosis.api.repositories;

import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}