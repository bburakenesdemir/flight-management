package com.burakenesdemir.flightmanagement.service;

import com.burakenesdemir.flightmanagement.data.entity.Flight;
import com.burakenesdemir.flightmanagement.data.entity.Ticket;
import com.burakenesdemir.flightmanagement.lib.dto.TicketDto;

import java.util.List;

public interface TicketService {

    Ticket create(TicketDto ticketDto);

    Ticket update(Long id,TicketDto ticketDto);

    Ticket delete(Long id);

    Ticket getById(Long id);

    List<Ticket> getByFlight(Flight flight);

    List<Ticket> getAll();

    Ticket getByNumber(String number);

    Ticket deleteByNumber(String number);
}