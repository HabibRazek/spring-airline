package com.zakia.airline.restcontrollers;
import com.zakia.airline.entities.Flight;
import com.zakia.airline.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/flights")
@CrossOrigin


public class FlightRestController {
    @Autowired
    FlightService flightService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
    @RequestMapping(method = RequestMethod.POST)
    public Flight saveFlight(@RequestBody Flight flight) {
        return flightService.saveFlight(flight);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Flight updateFlight(@RequestBody Flight flight) {
        return flightService.updateFlight(flight);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteFlightById(@PathVariable("id") int id) {
        flightService.deleteFlightById(id);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Flight getFlightById(@PathVariable("id") int id) {
        return flightService.getFlightById(id);
    }



    @RequestMapping(value="/flyByName/{nom}",method = RequestMethod.GET)
    public List<Flight> findBydestinationFlightContains(@PathVariable("nom") String nom) {
        return flightService.findBydestinationFlight(nom);
    }

    @RequestMapping(value="/count",method = RequestMethod.GET)
    public int countAllBy() {
        return flightService.countAllBy();
    }

}
