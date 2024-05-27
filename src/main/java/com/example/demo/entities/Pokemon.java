package com.example.demo.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "pokemon")
@Entity
@Data
public class Pokemon {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // You can choose a different data type if needed
	
	@Column()
	String nombre;
	
	@Column()
	String descripcion;
	
	@Column()
	Integer tipo_pokemon;
	
	@Column()
	@JsonFormat(shape = JsonFormat.Shape.NUMBER)
	Date fecha_descubrimiento;
	
	@Column()
	Integer generacion;
	
	@Column()
	String uuid;
	

}
