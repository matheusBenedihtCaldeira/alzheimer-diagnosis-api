package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.DeleteDoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class DeleteDoctorServiceImpl implements DeleteDoctorService {

    private final DoctorRepository repository;

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}