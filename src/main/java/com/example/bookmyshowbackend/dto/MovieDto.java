package com.example.bookmyshowbackend.dto;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Builder
@Data
public class MovieDto {

    int id;

    String name;

    LocalDate releaseDate;

    List<ShowDto> showDtoList;
}
