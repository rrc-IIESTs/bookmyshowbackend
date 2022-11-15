package com.example.bookmyshowbackend.Service;

import com.example.bookmyshowbackend.Model.MovieEntity;
import com.example.bookmyshowbackend.dto.MovieDto;

public interface MovieService {

    void addMovie(MovieDto movieDto);

    MovieDto getMovie(int id);
}
