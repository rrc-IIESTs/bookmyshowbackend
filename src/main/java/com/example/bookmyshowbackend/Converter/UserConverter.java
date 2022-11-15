package com.example.bookmyshowbackend.Converter;

import com.example.bookmyshowbackend.Model.UserEntity;
import com.example.bookmyshowbackend.dto.UserDto;
import lombok.experimental.UtilityClass;

import java.util.Optional;

@UtilityClass  //(Special class in java whose object cannot be created and whose all the methods are static)
public class UserConverter {

    public static UserEntity convertDtoToEntity(UserDto userDto){

        //I need to create a user

        return UserEntity.builder().name(userDto.getName()).mobileNo(userDto.getMobileNo()).build();

    }

    public static UserDto convertEntityToDto(Optional<UserEntity> userEntity){
        return UserDto.builder().id(userEntity.getId()).name(userEntity.getName()).mobileNo(userEntity.getMobileNo()).build();
    }


}
