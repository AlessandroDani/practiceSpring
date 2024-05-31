package com.example.demo.models;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDTO {

	String nombre;

	String descripcion;
	
	Integer tipoPokemon;
	
	Date fechaDescubrimiento;

	Integer generacion;
	
	String uuid;
	
}
