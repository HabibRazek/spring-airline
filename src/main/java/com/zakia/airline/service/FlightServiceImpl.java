package com.zakia.airline.service;

import com.zakia.airline.entities.Flight;
import com.zakia.airline.repos.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightServiceImpl implements FlightService{
    @Autowired
    FlightRepository flightRepository;
    @Override
    public Flight saveFlight(Flight flight)  {
        return flightRepository.save(flight);
    }

    @Override
    public Flight updateFlight(Flight flight) {
        return flightRepository.save(flight);
    }


    @Override
    public void deleteFlightById(int idFlight) {
        flightRepository.deleteById(idFlight);
    }

    @Override
    public Flight getFlightById(int IdFlight) {
        return flightRepository.findById(IdFlight).get();
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public List<Flight> findBydestinationFlight(String destinationFlight) {
        return flightRepository.findBydestinationFlight(destinationFlight);
    }

    @Override
    public int countAllBy() {
        return flightRepository.countAllBy();
    }


}
