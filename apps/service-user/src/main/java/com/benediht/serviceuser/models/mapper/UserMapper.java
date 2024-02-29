package com.benediht.serviceuser.models.mapper;

import com.benediht.serviceuser.models.dto.FindUserByIdResponseDTO;
import com.benediht.serviceuser.models.dto.UserDTO;
import com.benediht.serviceuser.models.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "role", target = "role")
    UserEntity userDtoToUserEntity(UserDTO userDTO);

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "role", target = "role")
    FindUserByIdResponseDTO userEntityToUserResponse(UserEntity userEntity);
}