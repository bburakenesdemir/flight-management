package com.burakenesdemir.flightmanagement.controller.mapper;

import com.burakenesdemir.flightmanagement.data.entity.Ticket;
import com.burakenesdemir.flightmanagement.lib.dto.TicketDto;
import com.burakenesdemir.flightmanagement.lib.resource.TicketResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketMapper extends AbstractMapper<TicketDto, Ticket, TicketResource> {
}
