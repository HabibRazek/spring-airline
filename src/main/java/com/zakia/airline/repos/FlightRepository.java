package com.zakia.airline.repos;

import com.zakia.airline.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
    List<Flight> findBydestinationFlight(String destinationFlight);
    int countAllBy();


}
