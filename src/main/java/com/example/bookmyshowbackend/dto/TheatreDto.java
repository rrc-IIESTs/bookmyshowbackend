package com.example.bookmyshowbackend.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TheatreDto {


    int id;

    String name;

    String address;

    String city;


    //ShowEntity
    ShowDto showDto;
}
