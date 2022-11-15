package com.example.bookmyshowbackend.Service.impl;

import com.example.bookmyshowbackend.Converter.TheatreConverter;
import com.example.bookmyshowbackend.Model.TheatreEntity;
import com.example.bookmyshowbackend.Model.TheatreSeatEntity;
import com.example.bookmyshowbackend.Repository.TheatreRepository;
import com.example.bookmyshowbackend.Repository.TheatreSeatRepository;
import com.example.bookmyshowbackend.Service.TheatreService;
import com.example.bookmyshowbackend.dto.TheatreDto;
import com.example.bookmyshowbackend.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TheatreServiceImpl implements TheatreService {

    @Autowired
    TheatreSeatRepository theatreSeatRepository;

    @Autowired
    TheatreRepository theatreRepository;


    @Override
    public TheatreDto addTheatre(TheatreDto theatreDto) {

        TheatreEntity theatreEntity = TheatreConverter.convertDtoToEntity(theatreDto);
        List<TheatreSeatEntity> seats = createTheatreSeats();

        for(TheatreSeatEntity theatreSeatEntity:seats){
            theatreSeatEntity.setTheatre(theatreEntity);
        }

        theatreEntity = theatreRepository.save(theatreEntity);

        return theatreDto;

    }
    List<TheatreSeatEntity> createTheatreSeats(){

        List<TheatreSeatEntity> seats = new ArrayList<>();
        seats.add(getTheaterSeat("1A",100,SeatType.CLASSIC));//Add in this TheatreSeatEntity
        seats.add(getTheaterSeat("1B",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1C",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1D",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1E",100,SeatType.CLASSIC));

        seats.add(getTheaterSeat("2A",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2B",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2C",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2D",200,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2E",200,SeatType.PREMIUM));

        theatreSeatRepository.saveAll(seats);

        return seats;
    }


    TheatreSeatEntity getTheaterSeat(String seatName, int rate, SeatType seatType){
        return TheatreSeatEntity.builder().seatNumber(seatName).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheatreDto getTheatre(int id) {
        TheatreEntity theatreEntity = theatreRepository.findById(id).get();
        TheatreDto theatreDto = TheatreConverter.convertEntityToDto(theatreEntity);
        return theatreDto;
    }
}
