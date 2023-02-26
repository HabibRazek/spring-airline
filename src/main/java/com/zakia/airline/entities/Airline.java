package com.zakia.airline.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Airline {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idAirline;
    private String nameAirline;
    private Integer numberofPlanesAirline;



}
