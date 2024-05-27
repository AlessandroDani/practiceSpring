package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "tipo_pokemon")
@Entity
public class Tipo_pokemon {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // You can choose a different data type if needed
	
	@Column
	String descripcion;
	
	@Column
	String uuid;
}
