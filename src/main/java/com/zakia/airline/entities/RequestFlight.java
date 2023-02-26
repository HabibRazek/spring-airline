package com.zakia.airline.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RequestFlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idrequestflight;

    @ManyToOne(cascade = CascadeType.ALL)
    private Passenger passenger;
}
