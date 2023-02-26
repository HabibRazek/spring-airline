package com.zakia.airline.service;

import com.zakia.airline.entities.Flight;
import com.zakia.airline.entities.Ticket;

import java.util.List;

public interface TicketService {
    Ticket saveTicket(Ticket ticket);
    Ticket updateTicket(Ticket ticket);
    void deleteTicketById(int idTicket);
    Ticket getTicketById(int IdTicket);
    List<Ticket> getAllTickets();

}
