package pe.edu.upeu.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.hotel.dao.PersonaDao;
import pe.edu.upeu.hotel.entity.Persona;
import pe.edu.upeu.hotel.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {
	@Autowired
	private PersonaDao personaDao;
	
	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personaDao.readAll();
	}

	@Override
	public int create(Persona person) {
		// TODO Auto-generated method stub
		return personaDao.create(person);
	}

	@Override
	public int edit(Persona person) {
		// TODO Auto-generated method stub
		return personaDao.edit(person);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personaDao.delete(id);
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		return personaDao.read(id);
	}

}
