package com.alzheimer.diagnosis.api.repositories;

import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

    Optional<DoctorEntity> findByEmail(String email);

    Optional<DoctorEntity> findByCrm(String crm);
}