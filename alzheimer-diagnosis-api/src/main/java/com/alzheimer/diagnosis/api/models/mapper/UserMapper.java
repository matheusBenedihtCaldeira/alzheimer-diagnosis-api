package com.alzheimer.diagnosis.api.models.mapper;

import com.alzheimer.diagnosis.api.models.dto.UserDTO;
import com.alzheimer.diagnosis.api.models.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity userDtoToUserEntity(UserDTO data);
}