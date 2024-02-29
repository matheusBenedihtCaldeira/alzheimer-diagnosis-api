package com.benediht.servicedoctor.models.mapper;

import com.benediht.servicedoctor.models.dto.DoctorDTO;
import com.benediht.servicedoctor.models.dto.FindDoctorByIdResponseDTO;
import com.benediht.servicedoctor.models.entities.DoctorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorEntity doctorDtoToDoctorEntitty(DoctorDTO doctorDto);
    FindDoctorByIdResponseDTO doctorEntityToDoctorDTO(DoctorEntity doctorEntity);
}