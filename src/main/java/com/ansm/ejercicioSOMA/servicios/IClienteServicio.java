package com.ansm.ejercicioSOMA.servicios;

import java.util.List;

import com.ansm.ejercicioSOMA.domain.Cliente;

public interface IClienteServicio {
	public List<Cliente> findAll();
	public void save(Cliente clientes);
	public Cliente findOne(Long id);
	public void delete(Long id);
	public List<Long> findId();
	List<Cliente> listadoClientes();
	Long creacionCliente(String nombrecliente);
}

