package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "entrenador")
@Entity
@Data
public class Entrenador {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // You can choose a different data type if needed

	@Column()
	String nombre;
	
	@Column()
	String apellido;
	
	@Column()
	String email;
	
	@Column()
	Date fecha_nacimiento;
	
	@Column()
	Date fecha_vinculacion;
	
	@Column()
	Integer pueblo_id;
	
	@Column()
	String uuid;
}
