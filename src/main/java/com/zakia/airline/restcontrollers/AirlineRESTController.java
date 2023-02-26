package com.zakia.airline.restcontrollers;

import com.zakia.airline.entities.Airline;
import com.zakia.airline.entities.Passenger;
import com.zakia.airline.entities.Ticket;
import com.zakia.airline.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/airlines")
@CrossOrigin
public class AirlineRESTController {

    @Autowired
    AirlineService airlineService;

    @RequestMapping(method = RequestMethod.POST)
    public Airline saveAirline(@RequestBody Airline airline) {
        return airlineService.saveAirline(airline);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Airline> getAllAirlines() {
        return airlineService.getAllAirlines();
    }


    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteAirlineById(@PathVariable("id") Long id) {
        airlineService.deleteAirlineById(id);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Airline getAirlineById(@PathVariable("id") Long id) {
        return airlineService.getAirlineById(id);
    }




    @RequestMapping(method = RequestMethod.PUT)
    public Airline updateAirline(@RequestBody Airline airline) {
        return airlineService.updateAirline(airline);
    }

    @RequestMapping(value="/count",method = RequestMethod.GET)
    public int countAllBy() {
        return airlineService.countAllBy();
    }
}
