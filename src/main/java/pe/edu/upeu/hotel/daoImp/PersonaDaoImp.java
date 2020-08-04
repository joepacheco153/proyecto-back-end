package pe.edu.upeu.hotel.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.hotel.dao.PersonaDao;
import pe.edu.upeu.hotel.entity.Persona;

@Repository
public class PersonaDaoImp implements PersonaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("Select * from personas", BeanPropertyRowMapper.newInstance(Persona.class));
	}

	@Override
	public int create(Persona person) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO personas (nombre, dni, fechanacimiento) VALUES (?,?,?);";
		return jdbcTemplate.update(sql, new Object[] {person.getNombre(), person.getDni(), person.getFechanacimiento()});
	}

	@Override
	public int edit(Persona person) {
		// TODO Auto-generated method stub
		String sql = "UPDATE personas SET nombre = ?, dni = ?, fechanacimiento = ? WHERE  idpersona = ?;";
		return jdbcTemplate.update(sql, person.getNombre(), person.getDni(), person.getFechanacimiento(), person.getIdpersona());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM personas where idpersona = ?";
		return jdbcTemplate.update(sql, new Object[] {id});
		
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		String sql = "Select * from personas where idpersona = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Persona.class));
	}

}
