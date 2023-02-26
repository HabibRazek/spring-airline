package com.zakia.airline.restcontrollers;

import com.zakia.airline.entities.Passenger;
import com.zakia.airline.entities.RequestFlight;
import com.zakia.airline.service.PassengerService;
import com.zakia.airline.service.RequestFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/req")
@CrossOrigin

public class RequestFlightResrController {
    @Autowired
    RequestFlightService requestFlightService;
    @RequestMapping(method = RequestMethod.POST)
    public RequestFlight saveRequest(@RequestBody RequestFlight requestFlight) {
        return  requestFlightService.saveRequest(requestFlight);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<RequestFlight> getAllRequests() {
        return requestFlightService.getAllRequests();
    }
    @RequestMapping(method = RequestMethod.PUT)
    public RequestFlight updateRequestFlight(@RequestBody RequestFlight requestFlight) {
        return requestFlightService.updateRequest(requestFlight);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteRequestById(@PathVariable("id") int id) {
        requestFlightService.deleteRequestFlighttById(id);
    }

}
