package com.alzheimer.diagnosis.api.servicers.doctor.impl;

import com.alzheimer.diagnosis.api.repositories.DoctorRepository;
import com.alzheimer.diagnosis.api.servicers.doctor.DeleteDoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteDoctorServiceImpl implements DeleteDoctorService {

    private final DoctorRepository repository;
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}