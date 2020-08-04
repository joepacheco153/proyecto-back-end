package pe.edu.upeu.hotel.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.hotel.dao.AlquilerDao;
import pe.edu.upeu.hotel.entity.Alquiler;
import pe.edu.upeu.hotel.entity.ReporteAlquiler;
import pe.edu.upeu.hotel.service.AlquilerService;
@Service
public class AlquilerServiceImp implements AlquilerService{
	@Autowired
	private AlquilerDao alquilerDao;
	
	@Override
	public int create(Alquiler alqui) {
		// TODO Auto-generated method stub
		return alquilerDao.create(alqui);
	}

	@Override
	public List<ReporteAlquiler> readReporte() {
		// TODO Auto-generated method stub
		return alquilerDao.readReporte();
	}
	

}
