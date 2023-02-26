package com.zakia.airline.service;

import com.zakia.airline.entities.Flight;

import java.util.List;

public interface FlightService {
    Flight saveFlight(Flight flight);
    Flight updateFlight(Flight flight);
    void deleteFlightById(int idFlight);
    Flight getFlightById(int IdFlight);
    List<Flight> getAllFlights();
    List<Flight>findBydestinationFlight(String destinationFlight);
    int countAllBy();
}
