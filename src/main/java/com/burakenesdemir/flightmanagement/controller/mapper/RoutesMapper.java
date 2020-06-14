package com.burakenesdemir.flightmanagement.controller.mapper;

import com.burakenesdemir.flightmanagement.data.entity.Routes;
import com.burakenesdemir.flightmanagement.lib.dto.RoutesDto;
import com.burakenesdemir.flightmanagement.lib.resource.RoutesResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoutesMapper extends AbstractMapper<RoutesDto, Routes, RoutesResource>{
}
