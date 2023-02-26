package com.zakia.airline.service;

import com.zakia.airline.entities.Airline;

import java.util.List;

public interface AirlineService {

    public Airline saveAirline(Airline airline);

    public Airline updateAirline(Airline airline);
    public void deleteAirline(Airline airline);
    public Airline getAirlineById(Long id);

    public void deleteAirlineById(Long id);
    public List<Airline> getAllAirlines();
    int countAllBy();
}
