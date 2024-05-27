package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "pueblo")
@Entity
public class Pueblo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // You can choose a different data type if needed
	
	@Column
	String nombre;
	
	@Column
	String uuid;
}
