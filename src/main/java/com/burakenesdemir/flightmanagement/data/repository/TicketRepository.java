package com.burakenesdemir.flightmanagement.data.repository;

import com.burakenesdemir.flightmanagement.data.entity.Flight;
import com.burakenesdemir.flightmanagement.data.entity.Routes;
import com.burakenesdemir.flightmanagement.data.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,String> {

    Ticket getById(Long id);

    List<Ticket> getByFlight(Flight flight);

    Ticket getByNumber(String number);

}
