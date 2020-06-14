package com.burakenesdemir.flightmanagement.service.impl;

import com.burakenesdemir.flightmanagement.controller.mapper.FlightMapper;
import com.burakenesdemir.flightmanagement.data.entity.Flight;
import com.burakenesdemir.flightmanagement.data.repository.FlightRepository;
import com.burakenesdemir.flightmanagement.lib.dto.FlightDto;
import com.burakenesdemir.flightmanagement.service.AirlineService;
import com.burakenesdemir.flightmanagement.service.FlightService;
import com.burakenesdemir.flightmanagement.service.RoutesService;
import com.burakenesdemir.flightmanagement.util.FlightManagementException;
import com.burakenesdemir.flightmanagement.util.constants.MessageTypeConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    FlightMapper flightMapper;

    @Autowired
    AirlineService airlineService;

    @Autowired
    RoutesService routesService;

    @Override
    public Flight create(FlightDto flightDto) {
        Flight flight;

        flight = flightMapper.toEntity(flightDto);
        flight.setAirline(airlineService.getById(flightDto.getAirlineId()));
        flight.setRoute(routesService.getById(flightDto.getRoutesId()));

        flight.setCreated(new Date());
        flight.setUpdated(new Date());

        return flightRepository.save(flight);
    }

    @Override
    public Flight update(Long id, FlightDto flightDto) {
        Flight flightToUpdate = flightRepository.getById(id);

        if (flightToUpdate == null) {
            throw new FlightManagementException(HttpStatus.NOT_FOUND, MessageTypeConstants.NOT_FOUND);
        }

        flightToUpdate = flightMapper.toEntity(flightDto);
        flightToUpdate.setAirline(airlineService.getById(flightDto.getAirlineId()));
        flightToUpdate.setRoute(routesService.getById(flightDto.getRoutesId()));

        flightToUpdate.setUpdated(new Date());


        return flightRepository.save(flightToUpdate);
    }

    @Override
    public Flight delete(Long id) {
        Flight flightToDelete = flightRepository.getById(id);

        if (flightToDelete == null) {
            throw new FlightManagementException(HttpStatus.NOT_FOUND, MessageTypeConstants.NOT_FOUND);
        }

        flightRepository.delete(flightToDelete);

        return flightToDelete;
    }

    @Override
    public Flight getById(Long id) {
        Flight flight = flightRepository.getById(id);

        if (flight == null) {
            throw new FlightManagementException(HttpStatus.NOT_FOUND, MessageTypeConstants.NOT_FOUND);
        }

        return flight;
    }

    @Override
    public List<Flight> getAll() {
        List<Flight> flights = flightRepository.findAll();

        if (flights.isEmpty()) {
            throw new FlightManagementException(HttpStatus.NOT_FOUND, MessageTypeConstants.NOT_FOUND);
        }

        return flights;
    }
}
