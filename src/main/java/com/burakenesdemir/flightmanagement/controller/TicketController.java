package com.burakenesdemir.flightmanagement.controller;

import com.burakenesdemir.flightmanagement.controller.mapper.AirlineMapper;
import com.burakenesdemir.flightmanagement.controller.mapper.TicketMapper;
import com.burakenesdemir.flightmanagement.lib.dto.AirlineDto;
import com.burakenesdemir.flightmanagement.lib.dto.TicketDto;
import com.burakenesdemir.flightmanagement.lib.resource.AirlineResource;
import com.burakenesdemir.flightmanagement.lib.resource.TicketResource;
import com.burakenesdemir.flightmanagement.service.AirlineService;
import com.burakenesdemir.flightmanagement.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {


    @Autowired
    TicketService ticketService;

    @Autowired
    TicketMapper ticketMapper;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TicketResource> create(@RequestBody TicketDto ticketDto) {
        return ResponseEntity.ok(ticketMapper.toResource(ticketService.create(ticketDto)));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<TicketResource> update(@PathVariable("id") Long id, @RequestBody TicketDto ticketDto) {
        return ResponseEntity.ok(ticketMapper.toResource(ticketService.update(id, ticketDto)));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<TicketResource> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(ticketMapper.toResource(ticketService.delete(id)));
    }

    @RequestMapping(value = "/ticket-number/{ticketNumber}", method = RequestMethod.DELETE)
    public ResponseEntity<TicketResource> deleteByNumber(@PathVariable("ticketNumber") String ticketNumber) {
        return ResponseEntity.ok(ticketMapper.toResource(ticketService.deleteByNumber(ticketNumber)));
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<TicketResource> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(ticketMapper.toResource(ticketService.getById(id)));
    }

    @RequestMapping(value = "/ticket-number/{ticketNumber}", method = RequestMethod.GET)
    public ResponseEntity<TicketResource> getByNumber(@PathVariable("ticketNumber") String ticketNumber) {
        return ResponseEntity.ok(ticketMapper.toResource(ticketService.getByNumber(ticketNumber)));
    }

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    public ResponseEntity<List<TicketResource>> getAll() {
        return ResponseEntity.ok(ticketMapper.toResource(ticketService.getAll()));
    }
}