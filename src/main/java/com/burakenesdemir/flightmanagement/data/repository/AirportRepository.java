package com.burakenesdemir.flightmanagement.data.repository;

import com.burakenesdemir.flightmanagement.data.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport,String> {

    Airport getById(Long id);
}
