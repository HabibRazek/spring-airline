package com.zakia.airline.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTicket;

    private String codeTicket;
    private String typeTicket;
    private Double amountTicket;
    private String status="available";
    private int nbrTicket;


    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Flight flight;


}
