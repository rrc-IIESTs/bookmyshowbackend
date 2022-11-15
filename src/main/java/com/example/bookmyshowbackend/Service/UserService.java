package com.example.bookmyshowbackend.Service;

import com.example.bookmyshowbackend.dto.UserDto;

public interface UserService {

    void addUser(UserDto userDto);

    UserDto getUser(int id);

}
