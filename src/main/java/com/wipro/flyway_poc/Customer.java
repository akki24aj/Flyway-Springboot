package com.wipro.flyway_poc;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;
@Entity
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JsonIgnore
    @OneToMany (mappedBy = "customer")
    private List<Contact> contacts;
    // getters & setters
}