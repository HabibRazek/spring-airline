package com.zakia.airline.restcontrollers;

import com.zakia.airline.entities.Ticket;
import com.zakia.airline.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin
public class TicketRESTController {
    @Autowired
    TicketService ticketService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Ticket saveTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ticket updateTicket(@RequestBody Ticket ticket) {
        return ticketService.updateTicket(ticket);
    }


    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteTicketById(@PathVariable("id") int id) {
        ticketService.deleteTicketById(id);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Ticket getTicketById(@PathVariable("id") int id) {
        return ticketService.getTicketById(id);
    }



}
