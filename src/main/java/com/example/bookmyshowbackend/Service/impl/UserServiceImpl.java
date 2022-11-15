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
        Optional<UserEntity> userEntity = userRepository.findById(id);

        UserDto userDto = UserConverter.convertEntityToDto(userEntity);
        return userDto;

    }
}
