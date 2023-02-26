package com.zakia.airline.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFlight ;
    private String codeFlight ;
    private String departFlight;
    private String destinationFlight;
    private Date dateFlight;
    private Integer numberofseatsFlight;


    @OneToMany(mappedBy = "flight")
    @JsonIgnore
    private List<Ticket> tickets;

   @ManyToOne
   @JoinColumn(name = "airline_id_airline")
   private Airline airline;







}
