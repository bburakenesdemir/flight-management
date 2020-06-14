package com.burakenesdemir.flightmanagement.service;

import com.burakenesdemir.flightmanagement.data.entity.Airline;
import com.burakenesdemir.flightmanagement.lib.dto.AirlineDto;

import java.util.List;

public interface AirlineService {

    Airline create(AirlineDto airlineDto);

    Airline update(Long id,AirlineDto airlineDto);

    Airline delete(Long id);

    Airline getById(Long id);

    List<Airline> getAll();
}