package com.benediht.servicedoctor.services.impl;

import com.benediht.servicedoctor.exceptions.DoctorAlredyRegisteredException;
import com.benediht.servicedoctor.exceptions.DoctorNotFoundException;
import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import com.benediht.servicedoctor.models.mapper.DoctorMapper;
import com.benediht.servicedoctor.repositories.DoctorRepository;
import com.benediht.servicedoctor.services.UpdateDoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateDoctorServiceImpl implements UpdateDoctorService {

    private final DoctorRepository repository;
    private final DoctorMapper mapper;
    @Override
    public void updateDoctor(Long id,DoctorDTO data) {
        DoctorEntity doctorFromDB = findDoctorById(id);
        DoctorEntity dataToUpdate = mapper.doctorDtoToDoctorEntitty(data);
        update(doctorFromDB, dataToUpdate);
        repository.save(doctorFromDB);
    }

    private DoctorEntity findDoctorById(Long id){
        return repository.findById(id).orElseThrow(() -> new DoctorNotFoundException("Doctor not found!"));
    }

    private void update(DoctorEntity doctorFromDB, DoctorEntity doctorWithDataToUpdate){
        doctorWithDataToUpdate.setId(doctorFromDB.getId());
        doctorWithDataToUpdate.setCreatedAt(doctorFromDB.getCreatedAt());
        BeanUtils.copyProperties(doctorWithDataToUpdate, doctorFromDB);
    }
}