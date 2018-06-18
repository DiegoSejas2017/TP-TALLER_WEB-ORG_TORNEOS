package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.EquipoDao;
import ar.edu.unlam.tallerweb1.dao.FechaDao;
import ar.edu.unlam.tallerweb1.modelo.Equipo;

@Service("servicioEquipo")
@Transactional
public class ServicioEquipoImpl implements ServicioEquipo{

	@Inject
	private EquipoDao equipoDao;

	@Override
	public void guardarEquipo(Equipo equipo) {
		equipoDao.guardarEquipo(equipo);	
	}
}
