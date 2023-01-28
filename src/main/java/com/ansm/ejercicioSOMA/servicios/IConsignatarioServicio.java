package com.ansm.ejercicioSOMA.servicios;

import java.util.List;

import com.ansm.ejercicioSOMA.domain.Consignatario;

public interface IConsignatarioServicio {
	
	public void save(Consignatario consignatario);
	List<Consignatario> listadoConsignatario();
	Long creacionConsignatario(Long clienteid,String nombreconsignatario);
}
