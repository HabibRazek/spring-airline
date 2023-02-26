package com.zakia.airline.service;


import com.zakia.airline.entities.Airline;
import com.zakia.airline.repos.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineServiceImpl implements AirlineService{
    @Autowired
    AirlineRepository airlineRepository;


    @Override
    public Airline saveAirline(Airline airline) {
    return airlineRepository.save(airline);

    }

    @Override
    public Airline updateAirline(Airline airline) {
    airlineRepository.save(airline);
        return airline;
    }

    @Override
    public void deleteAirline(Airline airline) {
    airlineRepository.delete(airline);
    }

    @Override
    public Airline getAirlineById(Long id) {
        return airlineRepository.findById(id).get();
    }

    @Override
    public void deleteAirlineById(Long id) {
    airlineRepository.deleteById(id);
    }

    @Override
    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

    @Override
    public int countAllBy() {
        return airlineRepository.countAllBy();
    }
}
