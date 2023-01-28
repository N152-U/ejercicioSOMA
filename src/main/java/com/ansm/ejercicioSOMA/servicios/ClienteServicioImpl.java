package com.ansm.ejercicioSOMA.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ansm.ejercicioSOMA.dao.IClienteDao;
import com.ansm.ejercicioSOMA.domain.Cliente;



@Service
public class ClienteServicioImpl implements IClienteServicio{
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {	
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente clientes) {
		clienteDao.save(clientes);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findOne(Long id) {	
		return clienteDao.findById(id.intValue()).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		if(id.intValue()>0) {
			clienteDao.deleteById(id.intValue());
		}
		
	}

	@Override
	public List<Long> findId() {
		
		return clienteDao.findId();
	}
	
	@Override
	public List<Cliente> listadoClientes() {
		
		return clienteDao.listadoClientes();
	}

	@Override
	public Long creacionCliente(String nombrecliente) {
		return clienteDao.creacionCliente(nombrecliente);
		
	}
	
//	@Override
//	@Transactional(readOnly=true)
//	public Page<Cliente> findAll(Pageable pegeable) {
//		return clienteDao.findAll(pegeable);
//	}

}
