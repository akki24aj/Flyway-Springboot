package com.wipro.flyway_poc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn (name = "customer_id")
    private Customer customer;
    private String name;
    private String email;
    private String phone;
    // getters & setters
}