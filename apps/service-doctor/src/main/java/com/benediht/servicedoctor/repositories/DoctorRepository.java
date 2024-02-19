package com.benediht.servicedoctor.repositories;

import com.benediht.servicedoctor.models.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}