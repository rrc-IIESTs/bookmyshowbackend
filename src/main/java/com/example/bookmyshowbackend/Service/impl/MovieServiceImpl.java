package com.example.bookmyshowbackend.Service.impl;

import com.example.bookmyshowbackend.Converter.MovieConverter;
import com.example.bookmyshowbackend.Model.MovieEntity;
import com.example.bookmyshowbackend.Repository.MovieRepository;
import com.example.bookmyshowbackend.Service.MovieService;
import com.example.bookmyshowbackend.dto.MovieDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
@Slf4j
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;
    @Override
    public MovieDto addMovie(MovieDto movieDto) {

        if(movieDto.getId()<0){
            throw new EntityNotFoundException("Movie can't be found");

        }

        log.info("Adding the movie");


        MovieEntity movieEntity = MovieConverter.convertDtoToEntity(movieDto);
        movieEntity = movieRepository.save(movieEntity);
        return movieDto;
    }

    @Override
    public MovieDto getMovie(int id) {

        MovieEntity movieEntity = movieRepository.findById(id).get();
        MovieDto movieDto = MovieConverter.convertEntityToDto(movieEntity);
        return movieDto;
    }
}
