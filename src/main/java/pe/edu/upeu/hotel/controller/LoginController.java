package pe.edu.upeu.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.hotel.entity.Login;
import pe.edu.upeu.hotel.entity.Usuario;
import pe.edu.upeu.hotel.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public Login read(@RequestBody Usuario usuario) {
		return loginService.usuario(usuario);
	}
}
