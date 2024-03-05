package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.exceptions.DoctorAlredyRegisteredException;
import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.models.mapper.DoctorMapper;
import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.RegisterDoctorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class RegisterDoctorServiceImpl implements RegisterDoctorService {

    private final DoctorRepository repository;
    private final DoctorMapper doctorMapper;

    @Override
    public DoctorEntity register(DoctorDTO data) {
        if (emailAlredyRegistered(data.email()) || crmAlredyRegistered(data.crm())) throw new DoctorAlredyRegisteredException("Doctor alredy exists!");
        log.info("Data received: {}", data);
        DoctorEntity doctor = doctorMapper.doctorDtoToDoctorEntitty(data);
        DoctorEntity doctorRegistred = repository.save(doctor);
        log.info("Doctor successfully registered: {}", doctorRegistred);
        return doctorRegistred;
    }

    private boolean emailAlredyRegistered(String email){
        return repository.findDoctorByEmail(email).isPresent();
    }

    private boolean crmAlredyRegistered(String crm){
        return repository.findDoctorByCrm(crm).isPresent();
    }
}