package com.ansm.ejercicioSOMA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.ansm.ejercicioSOMA.domain.Cliente;

@Service
public interface IClienteDao extends JpaRepository<Cliente, Integer>{

	@Query(value="SELECT c.clienteid FROM cliente c", nativeQuery = true)
	List<Long> findId();
	
	@Query(value="SELECT * FROM listadoClientesF();", nativeQuery = true)
	List<Cliente> listadoClientes();
	
	
}
