package com.ansm.ejercicioSOMA.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.ansm.ejercicioSOMA.domain.Cliente;

@Service
public interface IClienteDao extends PagingAndSortingRepository<Cliente, Integer>{
	
}
