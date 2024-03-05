package com.benediht.servicedoctor.models.mapper;

import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.dto.DoctorResponseDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DoctorMapper {


    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "crm", target = "crm")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    DoctorEntity doctorDtoToDoctorEntitty(DoctorDTO doctorDto);

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "crm", target = "crm")
    @Mapping(source = "email", target = "email")
    DoctorResponseDTO doctorEntityToDoctorDTO(DoctorEntity doctorEntity);
}