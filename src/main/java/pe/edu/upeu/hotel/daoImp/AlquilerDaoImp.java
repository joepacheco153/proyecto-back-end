package pe.edu.upeu.hotel.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.hotel.entity.Alquiler;
import pe.edu.upeu.hotel.entity.ReporteAlquiler;

@Repository
public class AlquilerDaoImp implements pe.edu.upeu.hotel.dao.AlquilerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Alquiler alqui) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO habitacion_persona (fechaEntrada, preciototal, idpersona, idhabitacion) VALUES (?, ?, ?, ?);";
		return jdbcTemplate.update(sql, new Object[] {alqui.getFechaEntrada(),alqui.getPreciototal(), alqui.getIdpersona(),alqui.getIdhabitacion() });
	}

	@Override
	public List<ReporteAlquiler> readReporte() {
		// TODO Auto-generated method stub
		String sql = "SELECT p.nombre, h.numero, hp.fechaEntrada, hp.preciototal from habitacion_persona as hp, personas as p, habitaciones as h where hp.idpersona = p.idpersona and hp.idhabitacion = h.idhabitacion;";
		return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(ReporteAlquiler.class));
	}

}
