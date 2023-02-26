package com.zakia.airline.restcontrollers;

import com.zakia.airline.entities.Passenger;

import com.zakia.airline.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PassengerRESTController {
    @Autowired
    PassengerService passengerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Passenger savePassenger(@RequestBody Passenger passenger) {
        return passengerService.savePassenger(passenger);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Passenger updatePassenger(@RequestBody Passenger passenger) {
        return passengerService.updatePassenger(passenger);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deletePassengerById(@PathVariable("id") int id) {
        passengerService.deletePassengerById(id);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Passenger getPassengerById(@PathVariable("id") int id) {
        return passengerService.getPassengerById(id);
    }

/*
    @RequestMapping(value="/flight/{id}",method = RequestMethod.GET)
    public List<Passenger> findByFlightId(@PathVariable("id") Long idflight) {
        return passengerService.findByFlightId(idflight);
    }

 */

    @RequestMapping(value="/firstname/{firstname}",method = RequestMethod.GET)
    public List<Passenger> findByfirstnamePassenger(@PathVariable("firstname") String firstnamePassenger) {
        return passengerService.findByfirstnamePassenger(firstnamePassenger);
    }

    @RequestMapping(value="/count",method = RequestMethod.GET)
    public int countAllBy() {
        return passengerService.countAllBy();
    }


}












