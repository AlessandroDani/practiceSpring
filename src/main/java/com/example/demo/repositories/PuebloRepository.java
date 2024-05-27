package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Pueblo;

public interface PuebloRepository extends JpaRepository<Pueblo, Integer> {

}
