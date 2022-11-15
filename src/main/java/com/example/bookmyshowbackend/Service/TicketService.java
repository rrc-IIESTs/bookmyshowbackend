package com.example.bookmyshowbackend.Service;

import com.example.bookmyshowbackend.dto.BookTicketRequestDto;
import com.example.bookmyshowbackend.dto.TicketDto;

public interface TicketService {

    TicketDto getTicket(int id);


    TicketDto bookTicket(BookTicketRequestDto bookTicketRequestDto);

}
