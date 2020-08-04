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

import pe.edu.upeu.hotel.entity.Habitacion;
import pe.edu.upeu.hotel.entity.TipoHabitacion;
import pe.edu.upeu.hotel.service.HabitacionService;

@RestController
public class HabitacionController {
	@Autowired
	private HabitacionService habitacionService;
	
	@GetMapping("/habitaciones")
	public List<Habitacion> readList(){
		return habitacionService.readAll();
	}
	@GetMapping("/habitaciones/{id}")
	public Habitacion read(@PathVariable int id) {
		return habitacionService.read(id);
	}
	@PostMapping("/habitacion")
	public int create(@RequestBody Habitacion habit) {
		System.out.println(habit);
		return habitacionService.create(habit);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return habitacionService.delete(id);
	}
	@PutMapping("/habitacion/{id}")
	public int edit (@RequestBody Habitacion habit, @PathVariable int id)  {  
		habit.setIdhabitacion(id);
		return habitacionService.edit(habit);
	}
	@PutMapping("/habitacionestado/{id}")
	public int cambiarestado (@RequestBody Habitacion habit, @PathVariable int id) {
		habit.setIdhabitacion(id);
		return habitacionService.cambiarestado(habit);
	}
	@GetMapping("/habitacionesdetalle")
	public List<TipoHabitacion> readDetalle(){
		return habitacionService.readDetalle();
	}
}
