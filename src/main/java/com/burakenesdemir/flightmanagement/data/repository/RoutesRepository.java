package com.burakenesdemir.flightmanagement.data.repository;

import com.burakenesdemir.flightmanagement.data.entity.Routes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutesRepository extends JpaRepository<Routes,String> {

    Routes getById(Long id);
}
