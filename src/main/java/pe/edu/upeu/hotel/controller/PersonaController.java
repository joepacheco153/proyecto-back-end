package pe.edu.upeu.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.hotel.entity.Persona;
import pe.edu.upeu.hotel.service.PersonaService;

@RestController
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> readList(){
		return personaService.readAll();
	}
	
	@GetMapping("/personas/{id}")
	public Persona read (@PathVariable int id) {
		return personaService.read(id);
	}
	@PostMapping("/persona")
	public int create(@RequestBody Persona person) {
		return personaService.create(person);
	}
	@DeleteMapping("/deletepersona/{id}")
	public int delete(@PathVariable int id) {
		return personaService.delete(id);
	}
	@PutMapping("/personas/{id}")
	public int edit (@RequestBody Persona person, @PathVariable int id) {
		person.setIdpersona(id);
		return personaService.edit(person);
	}
	
}
