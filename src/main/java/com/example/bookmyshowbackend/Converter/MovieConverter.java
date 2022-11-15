package com.example.bookmyshowbackend.Converter;

import com.example.bookmyshowbackend.Model.MovieEntity;
import com.example.bookmyshowbackend.dto.MovieDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConverter {

    public static MovieEntity convertDtoToEntity(MovieDto movieDto){

        return MovieEntity.builder().id(movieDto.getId()).name(movieDto.getName()).releaseDate(movieDto.getReleaseDate()).build();
    }

    public static MovieDto convertEntityToDto(MovieEntity movieEntity){
        return MovieDto.builder().id(movieEntity.getId()).name(movieEntity.getName()).releaseDate(movieEntity.getReleaseDate()).build();
    }

}
