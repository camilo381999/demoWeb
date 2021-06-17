package com.co.pragma.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.pragma.model.Persona;

public interface IntPersonaRepo extends JpaRepository<Persona, Integer> {
	
	

}
