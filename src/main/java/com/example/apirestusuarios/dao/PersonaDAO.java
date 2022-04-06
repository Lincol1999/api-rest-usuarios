package com.example.apirestusuarios.dao;


import com.example.apirestusuarios.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {


}
