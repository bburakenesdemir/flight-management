package com.burakenesdemir.flightmanagement.service.impl;

import com.burakenesdemir.flightmanagement.controller.mapper.RoutesMapper;
import com.burakenesdemir.flightmanagement.data.entity.Routes;
import com.burakenesdemir.flightmanagement.data.repository.RoutesRepository;
import com.burakenesdemir.flightmanagement.lib.dto.RoutesDto;
import com.burakenesdemir.flightmanagement.service.AirlineService;
import com.burakenesdemir.flightmanagement.service.AirportService;
import com.burakenesdemir.flightmanagement.service.RoutesService;
import com.burakenesdemir.flightmanagement.util.FlightManagementException;
import com.burakenesdemir.flightmanagement.util.constants.MessageTypeConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RoutesServiceImpl implements RoutesService {

    @Autowired
    RoutesMapper routesMapper;

    @Autowired
    RoutesRepository routesRepository;

    @Autowired
    AirportService airportService;

    @Autowired
    AirlineService airlineService;

    @Override
    public Routes create(RoutesDto routesDto) {
        Routes route = routesMapper.toEntity(routesDto);

        route.setDeptAirport(airportService.getById(routesDto.getDeptAirportId()));
        route.setDestAirport(airportService.getById(routesDto.getDestAirportId()));

        if (route.getDeptAirport().equals(route.getDestAirport())) {
            throw new FlightManagementException(HttpStatus.BAD_REQUEST, MessageTypeConstants.NOT_A_VALID_AIRPORT);
        }

        route.setCreated(new Date());
        route.setUpdated(new Date());

        return routesRepository.save(route);
    }

    @Override
    public Routes update(Long id, RoutesDto routesDto) {
        Routes routesToUpdate = routesRepository.getById(id);

        if (routesToUpdate == null) {
            throw new FlightManagementException(HttpStatus.NOT_FOUND, MessageTypeConstants.NOT_FOUND);
        }

        routesToUpdate = routesMapper.toEntity(routesDto);
        routesToUpdate.setDeptAirport(airportService.getById(routesDto.getDeptAirportId()));
        routesToUpdate.setDestAirport(airportService.getById(routesDto.getDestAirportId()));

        if (routesToUpdate.getDeptAirport().equals(routesToUpdate.getDestAirport())) {
            throw new FlightManagementException(HttpStatus.BAD_REQUEST, MessageTypeConstants.NOT_A_VALID_AIRPORT);
        }

        routesToUpdate.setId(id);
        routesToUpdate.setUpdated(new Date());

        return routesRepository.save(routesToUpdate);
    }

    @Override
    public Routes delete(Long id) {
        Routes routesToDelete = routesRepository.getById(id);

        if (routesToDelete == null) {
            throw new FlightManagementException(HttpStatus.NOT_FOUND, MessageTypeConstants.NOT_FOUND);
        }

        routesRepository.delete(routesToDelete);

        return routesToDelete;
    }

    @Override
    public Routes getById(Long id) {
        Routes routes = routesRepository.getById(id);

        if (routes == null) {
            throw new FlightManagementException(HttpStatus.NOT_FOUND, MessageTypeConstants.NOT_FOUND);
        }

        return routes;
    }

    @Override
    public List<Routes> getAll() {
        List<Routes> routes = routesRepository.findAll();

        if (routes.isEmpty()) {
            throw new FlightManagementException(HttpStatus.NOT_FOUND, MessageTypeConstants.NOT_FOUND);
        }

        return routes;
    }
}
