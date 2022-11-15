package com.example.bookmyshowbackend.Service;

import com.example.bookmyshowbackend.Model.MovieEntity;
import com.example.bookmyshowbackend.Repository.MovieRepository;
import com.example.bookmyshowbackend.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;

public interface MovieService {



    MovieDto addMovie(MovieDto movieDto);

    MovieDto getMovie(int id);
}
