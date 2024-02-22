package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.models.mapper.DoctorMapper;
import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.RegisterDoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterDoctorServiceImpl implements RegisterDoctorService {

    private final DoctorRepository repository;
    private final DoctorMapper doctorMapper;

    @Override
    public DoctorEntity register(DoctorDTO data) {
        DoctorEntity doctor = doctorMapper.doctorDtoToDoctorEntitty(data);
        return repository.save(doctor);
    }
}