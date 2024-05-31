package com.example.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Pokemon;
import com.example.demo.models.PokemonDTO;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
	
	List<Pokemon> findByTipoPokemon(Integer tipoPokemon);
}
