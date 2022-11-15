package com.example.bookmyshowbackend.Converter;


import com.example.bookmyshowbackend.Model.TheatreEntity;
import com.example.bookmyshowbackend.dto.TheatreDto;

public class TheatreConverter {

    public static TheatreEntity convertDtoToEntity(TheatreDto theatreDto){

        return TheatreEntity.builder().id(theatreDto.getId()).name(theatreDto.getName()).address(theatreDto.getAddress())
                .city(theatreDto.getCity()).build();
    }

    public static TheatreDto convertEntityToDto(TheatreEntity theatreEntity){

        return TheatreDto.builder().id(theatreEntity.getId()).address(theatreEntity.getAddress()).name(theatreEntity.getName())
                .city(theatreEntity.getCity()).build();
    }
}
