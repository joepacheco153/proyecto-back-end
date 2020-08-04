package pe.edu.upeu.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.hotel.dao.HabitacionDao;
import pe.edu.upeu.hotel.entity.Habitacion;
import pe.edu.upeu.hotel.entity.TipoHabitacion;
import pe.edu.upeu.hotel.service.HabitacionService;
@Service
public class HabitacionServiceImp implements HabitacionService {
	@Autowired
	private HabitacionDao habitacionDao;
	
	@Override
	public List<Habitacion> readAll() {
		// TODO Auto-generated method stub
		return habitacionDao.readAll();
	}

	@Override
	public int create(Habitacion habit) {
		// TODO Auto-generated method stub
		return habitacionDao.create(habit);
	}

	@Override
	public int edit(Habitacion habit) {
		// TODO Auto-generated method stub
		return habitacionDao.edit(habit);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return habitacionDao.delete(id);
	}

	@Override
	public Habitacion read(int id) {
		// TODO Auto-generated method stub
		return habitacionDao.read(id);
	}

	@Override
	public int cambiarestado(Habitacion habit) {
		// TODO Auto-generated method stub
		return habitacionDao.cambiarestado(habit);
	}

	@Override
	public List<TipoHabitacion> readDetalle() {
		// TODO Auto-generated method stub
		return habitacionDao.readDetalle();
	}
	

}
