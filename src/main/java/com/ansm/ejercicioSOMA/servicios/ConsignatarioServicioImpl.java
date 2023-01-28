package com.ansm.ejercicioSOMA.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ansm.ejercicioSOMA.dao.IConsignatarioDao;
import com.ansm.ejercicioSOMA.domain.Consignatario;


@Service
public class ConsignatarioServicioImpl implements IConsignatarioServicio {
	@Autowired
	private IConsignatarioDao consignatarioDao;
	
	@Override
	public List<Consignatario> listadoConsignatario() {
		
		return consignatarioDao.listadoConsignatario();
	}

	@Override
	public Long creacionConsignatario(Long clienteid, String nombreconsignatario) {
		return consignatarioDao.creacionConsignatario(clienteid,nombreconsignatario);
		
	}

	@Override
	public void save(Consignatario consignatario) {
		// TODO Auto-generated method stub
		
	}



}
