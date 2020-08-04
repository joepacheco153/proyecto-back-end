package pe.edu.upeu.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.hotel.entity.Alquiler;
import pe.edu.upeu.hotel.entity.ReporteAlquiler;
import pe.edu.upeu.hotel.service.AlquilerService;

@RestController
public class AlquilerController {
	@Autowired
	private AlquilerService alquilerService;
	
	@PostMapping ("/alquiler")
	public int create(@RequestBody Alquiler alqui) {
		return alquilerService.create(alqui);
	}
	@GetMapping("/alquileres")
	public List<ReporteAlquiler> readReporte(){
	return alquilerService.readReporte();
	}
}
