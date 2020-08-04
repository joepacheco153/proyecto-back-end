package pe.edu.upeu.hotel.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.hotel.dao.HabitacionDao;
import pe.edu.upeu.hotel.entity.Habitacion;
import pe.edu.upeu.hotel.entity.TipoHabitacion;

@Repository
public class HabitacionDaoImp implements HabitacionDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Habitacion> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from habitaciones", BeanPropertyRowMapper.newInstance(Habitacion.class));
	}

	@Override
	public int create(Habitacion habit) {
		// TODO Auto-generated method stub	
		String sql = "INSERT INTO habitaciones (numero, estado, idtipohabitacion) VALUES (?,1,?);";
		return jdbcTemplate.update(sql, new Object[] {habit.getNumero(), habit.getIdtipohabitacion()});
	}

	@Override
	public int edit(Habitacion habit) {
		// TODO Auto-generated method stub
		String sql = "UPDATE habitaciones SET numero = ?, estado = ?, idtipohabitacion=? WHERE idhabitacion =?;";
		return jdbcTemplate.update(sql, habit.getNumero(), habit.getEstado(), habit.getIdtipohabitacion(), habit.getIdhabitacion());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM habitaciones WHERE (idhabitacion = ?)";
		return jdbcTemplate.update(sql, new Object[] {id});
	}

	@Override
	public Habitacion read(int id) {
		// TODO Auto-generated method stub
		String sql = "Select * from habitaciones where idhabitacion= ? ";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Habitacion.class));
	}

	@Override
	public int cambiarestado(Habitacion habit) {
		// TODO Auto-generated method stub
		String sql = "UPDATE habitaciones SET estado = ? WHERE idhabitacion = ?;";
		return jdbcTemplate.update(sql, habit.getEstado(), habit.getIdhabitacion());
	}

	@Override
	public List<TipoHabitacion> readDetalle() {
		// TODO Auto-generated method stub
		String sql = "Select h.numero, h.estado, t.nombre, t.precio from habitaciones as h, tipohabitacion as t where h.idtipohabitacion = t.idtipohabitacion ;";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(TipoHabitacion.class));
	}

}
