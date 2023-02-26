package com.zakia.airline.service;

import com.zakia.airline.entities.Passenger;
import com.zakia.airline.entities.RequestFlight;
import com.zakia.airline.repos.RequestFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RequestFlightImpl implements RequestFlightService{
    @Autowired
    RequestFlightRepository requestRepository;

    @Override
    public RequestFlight saveRequest(RequestFlight request) {
        return requestRepository.save(request);
    }

    @Override
    public void deleteRequestFlighttById(int idrequest) {
            requestRepository.deleteById((long) idrequest);
    }

    @Override
    public RequestFlight getRequestById(int idrequest)
        {
            return requestRepository.findById((long) idrequest).get();
        }


    @Override
    public List<RequestFlight> getAllRequests() {
        return requestRepository.findAll();

    }

    @Override
    public RequestFlight updateRequest(RequestFlight request) {
        return requestRepository.save(request);

    }

    @Override
    public void deleteByPassenger(Passenger passenger) {
requestRepository.deleteByPassenger( passenger);
    }
}
