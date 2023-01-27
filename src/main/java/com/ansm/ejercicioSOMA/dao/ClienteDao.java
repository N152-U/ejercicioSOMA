package com.ansm.ejercicioSOMA.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ansm.ejercicioSOMA.domain.Cliente;
public interface ClienteDao extends JpaRepository<Cliente, Long>{
	
}
