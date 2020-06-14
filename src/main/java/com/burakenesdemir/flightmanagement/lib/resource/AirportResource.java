package com.burakenesdemir.flightmanagement.lib.resource;

import com.burakenesdemir.flightmanagement.lib.resource.base.BaseResource;
import lombok.Data;

@Data
public class AirportResource extends BaseResource {

    private String airportName;


    private String city;


    private String country;
}
