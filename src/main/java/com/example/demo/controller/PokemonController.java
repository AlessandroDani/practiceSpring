package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Entrenador;
import com.example.demo.entities.Pokemon;
import com.example.demo.models.PokemonDTO;
import com.example.demo.repositories.PokemonRepository;
import com.example.demo.services.EntrenadorServices;
import com.example.demo.services.PokemonServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PokemonController {

	@Autowired
	PokemonServices pokemonServices;

	@Autowired
	EntrenadorServices entrenadorServices;

	@GetMapping("/status")
	public Map<String, Object> getStatus() {
		Map<String, Object> status = new HashMap<>();
		status.put("message", "Servidor en funcionamiento");
		status.put("timestamp", LocalDateTime.now());
		return status;
	}

	@GetMapping("/pokemon")
	public List<Pokemon> pokemon() {
		return pokemonServices.getAll();
	}

	@GetMapping("/entrenador/login/{email}")
	public Map<String, String> getEntrenador(@PathVariable String email) {
		return entrenadorServices.postEntrenador(email);
	}
	
	@GetMapping("/pokemons/{tipo}")
	public Pokemon getPokemosByTipo(@PathVariable Integer tipo) {
		return pokemonServices.getPokemon(tipo);
	}
	
	@PostMapping("/pokemons")
	public Pokemon postPokemon(@RequestBody PokemonDTO pokemon) {
		System.out.println(pokemon);
        return pokemonServices.savePokemon(pokemon);
    }
	
	@GetMapping("/entrenador/{uuid}/pokemons")
	public List<Pokemon> getPokemonsEntrenador(@PathVariable String uuid) {
		List<Pokemon> ans = entrenadorServices.getPokemones(uuid);
		return ans.isEmpty()? null : ans;
		
	}
	
	
}
