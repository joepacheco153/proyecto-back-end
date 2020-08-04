package pe.edu.upeu.hotel.service;

import java.util.List;

import pe.edu.upeu.hotel.entity.Persona;

public interface PersonaService {
	List<Persona>readAll();
	int create (Persona person);
	int edit (Persona person);
	int delete (int id);
	Persona read (int id);
}
