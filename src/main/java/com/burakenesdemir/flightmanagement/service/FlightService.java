package com.burakenesdemir.flightmanagement.service;

import com.burakenesdemir.flightmanagement.data.entity.Flight;
import com.burakenesdemir.flightmanagement.lib.dto.FlightDto;

import java.util.List;

public interface FlightService {

    Flight create(FlightDto flightDto);

    Flight update(Long id,FlightDto flightDto);

    Flight delete(Long id);

    Flight getById(Long id);

    List<Flight> getAll();
}