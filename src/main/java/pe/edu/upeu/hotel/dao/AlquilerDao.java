package pe.edu.upeu.hotel.dao;

import java.util.List;

import pe.edu.upeu.hotel.entity.Alquiler;
import pe.edu.upeu.hotel.entity.ReporteAlquiler;

public interface AlquilerDao {
	
	int create (Alquiler alqui);
	List<ReporteAlquiler> readReporte();
}
