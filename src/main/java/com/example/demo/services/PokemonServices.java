package com.example.demo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

	public List<PokemonDTO> getPokemon(Integer tipoPokemon) {
		List<PokemonDTO> ans = new ArrayList<PokemonDTO>();
		List<Pokemon> query = pokemonRepository.findByTipoPokemon(tipoPokemon);
		for(Pokemon x: query) {
			ans.add(convertToDto(x));
		}
		return ans;
	}

	public Pokemon savePokemon(PokemonDTO pokemonDTO) {
        // Convertir PokemonDTO a entidad Pokemon
        Pokemon pokemon = new Pokemon();
        pokemon.setNombre(pokemonDTO.getNombre());
        pokemon.setDescripcion(pokemonDTO.getDescripcion());
        pokemon.setTipoPokemon(pokemonDTO.getTipoPokemon());
        pokemon.setFechaDescubrimiento(pokemonDTO.getFechaDescubrimiento());
        pokemon.setGeneracion(pokemonDTO.getGeneracion());
        pokemon.setUuid(pokemonDTO.getUuid());

        // Guardar en la base de datos
        pokemonRepository.save(pokemon);
        return pokemon;
    }
	
	private PokemonDTO convertToDto(Pokemon pokemon) {
        PokemonDTO dto = new PokemonDTO();
        dto.setNombre(pokemon.getNombre());
        dto.setDescripcion(pokemon.getDescripcion());
        dto.setTipoPokemon(pokemon.getTipoPokemon());
        dto.setFechaDescubrimiento(pokemon.getFechaDescubrimiento());
        dto.setGeneracion(pokemon.getGeneracion());
        dto.setUuid(pokemon.getUuid());
        return dto;
    }

}
