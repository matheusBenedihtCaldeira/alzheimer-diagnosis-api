package com.benediht.serviceuser.repositories;

import com.benediht.serviceuser.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}