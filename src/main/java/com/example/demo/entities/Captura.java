package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "captura")
public class Captura {

    @Id
    private Integer id;  // You can choose a different data type if needed

    @Column
    private Integer pokemon_id;

    @Column
    private Integer entrandor_id;
}
