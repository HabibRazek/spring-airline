package com.zakia.airline.service;

import com.zakia.airline.entities.Passenger;
import com.zakia.airline.repos.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService{
    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger updatePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public void deletePassenger(Passenger passenger) {
        passengerRepository.delete(passenger);
    }

    @Override
    public void deletePassengerById(int idpassenger) {
        passengerRepository.deleteById(idpassenger);

    }

    @Override
    public Passenger getPassengerById(int idpassenger) {
        return passengerRepository.findById(idpassenger).get();
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @Override
    public List<Passenger> findByfirstnamePassenger(String firstnamePassenger) {
        return passengerRepository.findByfirstnamePassenger(firstnamePassenger);
    }

    @Override
    public int countAllBy() {
        return passengerRepository.countAllBy();
    }


}
