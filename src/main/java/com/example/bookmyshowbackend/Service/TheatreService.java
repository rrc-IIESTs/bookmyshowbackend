package com.example.bookmyshowbackend.Service;

import com.example.bookmyshowbackend.dto.TheatreDto;

public interface TheatreService {


    TheatreDto addTheatre(TheatreDto theatreDto);

    TheatreDto getTheatre(int id);
}
