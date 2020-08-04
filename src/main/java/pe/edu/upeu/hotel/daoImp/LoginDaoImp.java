package pe.edu.upeu.hotel.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.hotel.dao.LoginDao;
import pe.edu.upeu.hotel.entity.Habitacion;
import pe.edu.upeu.hotel.entity.Login;
import pe.edu.upeu.hotel.entity.Usuario;

@Repository
public class LoginDaoImp implements LoginDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Login usuario(Usuario usuario) {
		// TODO Auto-generated method stub
		String sql = "select u.nomusuario, r.nomrol from usuarios u, roles r,roles_usuarios ru where u.nomusuario = ? and u.clave = ? and r.idrol = ru.idrol and ru.idusuario = u.idusuario";
		return jdbcTemplate.queryForObject(sql, new Object[] {usuario.getNomusuario(), usuario.getClave()}, BeanPropertyRowMapper.newInstance(Login.class));
	}



}
