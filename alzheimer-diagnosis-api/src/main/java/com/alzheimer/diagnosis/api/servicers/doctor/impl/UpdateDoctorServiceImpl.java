package com.alzheimer.diagnosis.api.servicers.doctor.impl;

import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import com.alzheimer.diagnosis.api.models.mapper.DoctorMapper;
import com.alzheimer.diagnosis.api.repositories.DoctorRepository;
import com.alzheimer.diagnosis.api.servicers.doctor.UpdateDoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateDoctorServiceImpl implements UpdateDoctorService {

    private final DoctorMapper mapper;
    private final DoctorRepository repository;

    @Override
    public void update(Long id, DoctorDTO data) {
        DoctorEntity doctorFromDB = repository.findById(id).get();
        DoctorEntity doctorWithDataToUpdate = mapper.doctorDtoToDoctorEntity(data);
        update(doctorFromDB, doctorWithDataToUpdate);
        repository.save(doctorFromDB);
    }

    private void update(DoctorEntity doctorFromDB, DoctorEntity doctorWithDataToUpdate) {
        doctorWithDataToUpdate.setId(doctorFromDB.getId());
        doctorWithDataToUpdate.setCreatedAt(doctorFromDB.getCreatedAt());
        BeanUtils.copyProperties(doctorWithDataToUpdate, doctorFromDB);
    }
}