package pe.edu.upeu.hotel.service;

import java.util.List;

import pe.edu.upeu.hotel.entity.Alquiler;
import pe.edu.upeu.hotel.entity.ReporteAlquiler;

public interface AlquilerService {
	int create (Alquiler alqui);
	List<ReporteAlquiler> readReporte();
}
