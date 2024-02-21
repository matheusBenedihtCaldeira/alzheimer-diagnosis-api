package com.benediht.servicedoctor.services;

import com.benediht.servicedoctor.models.entities.DoctorEntity;

import java.util.List;

public interface IndexDoctorsService {
    List<DoctorEntity> indexDoctors();
}