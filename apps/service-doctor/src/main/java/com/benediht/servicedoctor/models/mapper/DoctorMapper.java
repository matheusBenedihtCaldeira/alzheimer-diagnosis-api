package com.benediht.servicedoctor.models.mapper;

import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorEntity doctorDtoToDoctorEntitty(DoctorDTO doctorDto);
}