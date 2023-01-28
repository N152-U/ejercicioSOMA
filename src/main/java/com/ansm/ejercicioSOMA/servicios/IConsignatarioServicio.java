package com.ansm.ejercicioSOMA.servicios;

import java.util.List;

import com.ansm.ejercicioSOMA.domain.Consignatario;

public interface IConsignatarioServicio {
	public List<Consignatario> findAll();
	public void save(Consignatario consignatarios);
	public Consignatario findOne(Long id);
	public void delete(Long id);
	public List<Long> findId();
	List<Consignatario> listadoConsignatario();
	Long creacionConsignatario(String nombreconsignatario);
}
