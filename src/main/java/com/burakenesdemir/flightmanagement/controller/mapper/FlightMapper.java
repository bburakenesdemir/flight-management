package com.burakenesdemir.flightmanagement.controller.mapper;

import com.burakenesdemir.flightmanagement.data.entity.Flight;
import com.burakenesdemir.flightmanagement.lib.dto.FlightDto;
import com.burakenesdemir.flightmanagement.lib.resource.FlightResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FlightMapper extends AbstractMapper<FlightDto, Flight, FlightResource>{
}
