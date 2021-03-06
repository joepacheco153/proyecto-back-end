package pe.edu.upeu.hotel.dao;

import java.util.List;

import pe.edu.upeu.hotel.entity.Habitacion;
import pe.edu.upeu.hotel.entity.TipoHabitacion;

public interface HabitacionDao {
	
	List<Habitacion> readAll();
	int create (Habitacion habit);
	int edit (Habitacion habit);
	int delete (int id);
	Habitacion read (int id);
	int cambiarestado (Habitacion habit);
	List<TipoHabitacion> readDetalle();
}
