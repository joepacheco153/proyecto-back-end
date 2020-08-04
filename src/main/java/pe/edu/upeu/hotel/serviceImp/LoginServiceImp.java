package pe.edu.upeu.hotel.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.hotel.dao.LoginDao;
import pe.edu.upeu.hotel.entity.Login;
import pe.edu.upeu.hotel.entity.Usuario;
import pe.edu.upeu.hotel.service.LoginService;
@Service
public class LoginServiceImp implements LoginService {
	@Autowired
	private LoginDao loginDao;
	


	@Override
	public Login usuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return loginDao.usuario(usuario);
	}

}
