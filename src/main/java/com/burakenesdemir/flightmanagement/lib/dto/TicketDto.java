package com.burakenesdemir.flightmanagement.lib.dto;

import com.burakenesdemir.flightmanagement.lib.dto.base.BaseDto;
import lombok.Data;

@Data
public class TicketDto extends BaseDto {

    private Long flightId;

    private String number;

    private String cardNumber;

}
