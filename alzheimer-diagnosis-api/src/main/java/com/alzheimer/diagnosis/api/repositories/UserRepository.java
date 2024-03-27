package com.alzheimer.diagnosis.api.repositories;

import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}