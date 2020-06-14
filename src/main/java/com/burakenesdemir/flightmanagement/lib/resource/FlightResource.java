package com.burakenesdemir.flightmanagement.lib.resource;

import com.burakenesdemir.flightmanagement.data.entity.Airline;
import com.burakenesdemir.flightmanagement.data.entity.Routes;
import com.burakenesdemir.flightmanagement.lib.resource.base.BaseResource;
import lombok.Data;

import java.util.Date;

@Data
public class FlightResource extends BaseResource {

    private Airline airline;

    private Routes routes;

    private Integer seats;

    private Date date;

    private Double ticketPrice;

}
