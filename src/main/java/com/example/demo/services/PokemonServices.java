package com.example.demo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Pokemon;
import com.example.demo.models.PokemonDTO;
import com.example.demo.repositories.PokemonRepository;

@Service
public class PokemonServices {

	@Autowired
	PokemonRepository pokemonRepository;

	public List<Pokemon> getAll() {
		return pokemonRepository.findAll();
	}

	public Pokemon getPokemon(Integer tipo) {
		List<Pokemon> pokemones = pokemonRepository.findAll();
		for (Pokemon p : pokemones) {
			if (p.getTipo_pokemon() == tipo) {
				return p;
			}
		}
		return null;
	}

	public Pokemon savePokemon(PokemonDTO pokemonDTO) {
        // Convertir PokemonDTO a entidad Pokemon
        Pokemon pokemon = new Pokemon();
        pokemon.setNombre(pokemonDTO.getNombre());
        pokemon.setDescripcion(pokemonDTO.getDescripcion());
        pokemon.setTipo_pokemon(pokemonDTO.getTipo_pokemon());
        pokemon.setFecha_descubrimiento((java.sql.Date) pokemonDTO.getFecha_descubrimiento());
        pokemon.setGeneracion(pokemonDTO.getGeneracion());
        pokemon.setUuid(pokemonDTO.getUuid());

        // Guardar en la base de datos
        pokemonRepository.save(pokemon);
        return pokemon;
    }

}
