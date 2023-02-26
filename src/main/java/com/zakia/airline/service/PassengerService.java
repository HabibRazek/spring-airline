package com.zakia.airline.service;


import com.zakia.airline.entities.Passenger;

import java.util.List;

public interface PassengerService {
Passenger savePassenger(Passenger passenger);
Passenger updatePassenger(Passenger passenger);
void deletePassenger(Passenger passenger);
void deletePassengerById(int idpassenger);
Passenger getPassengerById(int idpassenger);
List<Passenger> getAllPassengers();

List<Passenger> findByfirstnamePassenger(String firstnamePassenger);
    int countAllBy();

}
