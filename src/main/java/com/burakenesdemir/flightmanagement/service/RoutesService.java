package com.burakenesdemir.flightmanagement.service;

import com.burakenesdemir.flightmanagement.data.entity.Routes;
import com.burakenesdemir.flightmanagement.lib.dto.RoutesDto;

import java.util.List;

public interface RoutesService {

    Routes create(RoutesDto routesDto);

    Routes update(Long id, RoutesDto routesDto);

    Routes delete(Long id);

    Routes getById(Long id);

    List<Routes> getAll();
}