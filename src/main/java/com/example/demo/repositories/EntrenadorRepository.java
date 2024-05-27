package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Entrenador;

public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> {

}
