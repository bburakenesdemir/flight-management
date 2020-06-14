package com.burakenesdemir.flightmanagement.lib.resource;

import com.burakenesdemir.flightmanagement.data.entity.Airport;
import com.burakenesdemir.flightmanagement.lib.resource.base.BaseResource;
import lombok.Data;

import java.util.Date;

@Data
public class RoutesResource extends BaseResource {

    private Date arrTime;

    private Date depTime;

    private Airport deptAirport;

    private Airport destAirport;

}