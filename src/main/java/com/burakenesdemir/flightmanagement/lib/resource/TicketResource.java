package com.burakenesdemir.flightmanagement.lib.resource;

import com.burakenesdemir.flightmanagement.lib.resource.base.BaseResource;
import lombok.Data;

@Data
public class TicketResource extends BaseResource {

    private String flightId;

    private String userId;

    private Double price;

    private String number;

    private String cardNumber;

}
