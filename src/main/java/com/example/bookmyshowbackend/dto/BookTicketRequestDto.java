package com.example.bookmyshowbackend.dto;

import com.example.bookmyshowbackend.enums.SeatType;

import java.util.Set;

public class BookTicketRequestDto {

    Set<String> requestedSeats;

    int id;

    int showId;

    SeatType seatType;



}
