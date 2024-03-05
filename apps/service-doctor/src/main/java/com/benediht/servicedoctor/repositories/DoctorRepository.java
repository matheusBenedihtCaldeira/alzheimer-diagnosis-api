package com.benediht.servicedoctor.repositories;

import com.benediht.servicedoctor.models.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
    Optional<DoctorEntity> findDoctorByCrm(String crm);
    Optional<DoctorEntity> findDoctorByEmail(String email);
}