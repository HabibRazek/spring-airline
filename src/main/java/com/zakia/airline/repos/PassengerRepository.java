package com.zakia.airline.repos;

import com.zakia.airline.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PassengerRepository extends JpaRepository<Passenger, Integer> {


    List<Passenger> findByfirstnamePassenger(String firstnamePassenger);

    int countAllBy();


}

