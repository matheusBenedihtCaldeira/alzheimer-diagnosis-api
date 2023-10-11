package com.api.prediction.repositories;

import com.api.prediction.models.entities.PacientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientRepository extends JpaRepository<PacientEntity, Long> {
}