package com.burakenesdemir.flightmanagement.service;

import com.burakenesdemir.flightmanagement.data.entity.Airport;
import com.burakenesdemir.flightmanagement.lib.dto.AirportDto;

import java.util.List;

public interface AirportService {

    Airport create(AirportDto airportDto);

    Airport update(Long id,AirportDto airportDto);

    Airport delete(Long id);

    Airport getById(Long id);

    List<Airport> getAll();
}