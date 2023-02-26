package com.zakia.airline.repos;

import com.zakia.airline.entities.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline, Long> {
    int countAllBy();
}
