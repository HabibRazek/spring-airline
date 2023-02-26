package com.zakia.airline.service;

import com.zakia.airline.entities.Ticket;
import com.zakia.airline.repos.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicketById(int idTicket) {
        ticketRepository.deleteById(idTicket);
    }

    @Override
    public Ticket getTicketById(int IdTicket) {
        return ticketRepository.findById(IdTicket).get();
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }


}
