package com.zakia.airline.repos;

import com.zakia.airline.entities.Passenger;
import com.zakia.airline.entities.RequestFlight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestFlightRepository extends JpaRepository<RequestFlight,Long> {

    public void deleteByPassenger(Passenger passenger);

    public RequestFlight findByPassenger(Passenger passenger);

}
