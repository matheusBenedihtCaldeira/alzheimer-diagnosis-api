package com.alzheimer.diagnosis.api.models.mapper;

import com.alzheimer.diagnosis.api.models.dto.PatientDTO;
import com.alzheimer.diagnosis.api.models.entities.PatientEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    PatientEntity patientDtoToPatientEntity(PatientDTO data);
}