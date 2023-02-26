package com.zakia.airline.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passenger {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long idPassenger;

    private String firstnamePassenger;
    private String lastnamePassenger;
    private String cinPassenger;
    private String passportPassenger;
    private String adressPassenger;
    private String nationalityPassenger;
    private String genderPassenger;
    private String phonePassenger;
private String passwordPassenger;
    @OneToMany(mappedBy = "passenger")
    @JsonIgnore
    private List<Ticket> tickets;

    private String role;


}
