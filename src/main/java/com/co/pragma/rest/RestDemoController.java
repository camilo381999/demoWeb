package com.co.pragma.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.pragma.repo.IntPersonaRepo;
import com.co.pragma.model.Persona;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	
	@Autowired
	private IntPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona persona){
		repo.save(persona);
	}

	@PutMapping
	public void modificar(@RequestBody Persona persona){
		repo.save(persona);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		repo.deleteById(id);
	}



}
