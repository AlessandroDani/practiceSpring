package com.example.demo.models;

import java.sql.Date;

import lombok.Data;

@Data
public class EntrenadorDTO {

	String nombre;
	
	String apellido;
	
	String email;
	
	Date fecha_nacimiento;
	
	Date fecha_vinculacion;
	
	Integer pueblo_id;
	
	String uuid;
}
