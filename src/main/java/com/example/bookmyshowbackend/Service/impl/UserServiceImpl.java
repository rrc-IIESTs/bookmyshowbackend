package com.example.bookmyshowbackend.Service.impl;

import com.example.bookmyshowbackend.Converter.UserConverter;
import com.example.bookmyshowbackend.Model.UserEntity;
import com.example.bookmyshowbackend.Repository.UserRepository;
import com.example.bookmyshowbackend.Service.UserService;
import com.example.bookmyshowbackend.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserDto userDto) {


        UserEntity userEntity= UserConverter.convertDtoToEntity(userDto);

        userRepository.save(userEntity);


    }

    @Override
    public UserDto getUser(int id) {

        UserEntity user = new UserEntity();

        UserEntity userEntity = userRepository.findById(id).get();

        //.get() is an inbuilt function which will either throw error if entity is not found else it'll return entity

        UserDto userDto = UserConverter.convertEntityToDto(userEntity);
        return userDto;

    }
}
