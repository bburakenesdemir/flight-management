package com.burakenesdemir.flightmanagement.controller.mapper;

import com.burakenesdemir.flightmanagement.data.entity.Airline;
import com.burakenesdemir.flightmanagement.lib.dto.AirlineDto;
import com.burakenesdemir.flightmanagement.lib.resource.AirlineResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AirlineMapper extends AbstractMapper<AirlineDto, Airline, AirlineResource>{
}
