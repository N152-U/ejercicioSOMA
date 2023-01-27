package com.ansm.ejercicioSOMA.servicios;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ansm.ejercicioSOMA.domain.Cliente;

public interface IClienteServicio {
	public List<Cliente> findAll();
	public Page<Cliente> findAll(Pageable pegeable);
	public void save(Cliente clientes);
	public Cliente findOne(Long id);
	public void delete(Long id);
}

