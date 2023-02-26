package com.zakia.airline.repos;

import com.zakia.airline.entities.Passenger;
import com.zakia.airline.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {


}
