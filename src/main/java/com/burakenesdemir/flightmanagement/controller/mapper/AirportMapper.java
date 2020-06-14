package com.burakenesdemir.flightmanagement.controller.mapper;

import com.burakenesdemir.flightmanagement.data.entity.Airport;
import com.burakenesdemir.flightmanagement.lib.dto.AirportDto;
import com.burakenesdemir.flightmanagement.lib.resource.AirportResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AirportMapper extends AbstractMapper<AirportDto, Airport, AirportResource> {
}
