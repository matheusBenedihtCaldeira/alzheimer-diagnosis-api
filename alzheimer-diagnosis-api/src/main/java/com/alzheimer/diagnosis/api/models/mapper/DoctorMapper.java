package com.alzheimer.diagnosis.api.models.mapper;

import com.alzheimer.diagnosis.api.models.dto.DoctorDTO;
import com.alzheimer.diagnosis.api.models.entities.DoctorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorEntity doctorDtoToDoctorEntity(DoctorDTO data);
}