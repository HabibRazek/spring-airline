package com.zakia.airline.service;

import com.zakia.airline.entities.Passenger;
import com.zakia.airline.entities.RequestFlight;

import java.util.List;

public interface RequestFlightService {

    public RequestFlight saveRequest(RequestFlight request);
    public void deleteRequestFlighttById(int idrequest);
    public RequestFlight getRequestById(int idrequest);
    public List<RequestFlight> getAllRequests();
    public RequestFlight updateRequest(RequestFlight request);

    void deleteByPassenger(Passenger passenger);
}
