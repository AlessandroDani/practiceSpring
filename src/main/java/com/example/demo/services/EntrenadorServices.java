package com.example.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.EntrenadorRepository;
import com.example.demo.repositories.PokemonRepository;
import com.example.demo.entities.Entrenador;
import com.example.demo.entities.Pokemon;
import com.example.demo.models.*;

@Service
public class EntrenadorServices {

	@Autowired
	EntrenadorRepository entrenadorRepository;
	
	@Autowired
	PokemonRepository pokemonRepository;

	public Map<String, String> postEntrenador(String email) {
		
		Entrenador entrenadorRet = entrenadorRepository.findByEmail(email);
		Map<String, String> entrenador = new HashMap<>();
		
		if(entrenadorRet != null) {
			 entrenador.put("uuid", entrenadorRet.getEmail());
		}else {
			entrenador.put("Error", "No hay entrenador con ese email");
		}
		return entrenador;
	}
	
	public List<Pokemon> getPokemones(String uuid){
		List<Pokemon> list = pokemonRepository.findAll();
		List<Pokemon> listPokemonsEntrenador = new ArrayList();
		for(Pokemon p: list) {
			if(p.getUuid().equals(uuid)) {
				listPokemonsEntrenador.add(p);
			}
		}
		return listPokemonsEntrenador;
	}

}
