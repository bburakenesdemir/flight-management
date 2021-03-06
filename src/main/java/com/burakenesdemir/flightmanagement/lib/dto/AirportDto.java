package com.burakenesdemir.flightmanagement.lib.dto;

import com.burakenesdemir.flightmanagement.lib.dto.base.BaseDto;
import lombok.Data;

@Data
public class AirportDto extends BaseDto {

    private String airportName;


    private String city;


    private String country;

}
