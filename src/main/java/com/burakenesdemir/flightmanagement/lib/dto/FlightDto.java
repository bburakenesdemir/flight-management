package com.burakenesdemir.flightmanagement.lib.dto;
import com.burakenesdemir.flightmanagement.lib.dto.base.BaseDto;
import lombok.Data;

import java.util.Date;

@Data
public class FlightDto extends BaseDto {

    private Long airlineId;

    private Long routesId;

    private Integer seats;

    private Date date;

    private Double ticketPrice;

}
