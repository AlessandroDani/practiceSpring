package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Pokemon;
import com.example.demo.models.PokemonDTO;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
}
