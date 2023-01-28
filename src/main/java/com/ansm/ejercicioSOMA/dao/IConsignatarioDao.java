package com.ansm.ejercicioSOMA.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.ansm.ejercicioSOMA.domain.Consignatario;

@Service
public interface IConsignatarioDao extends JpaRepository<Consignatario, Integer>{
	
	@Query(value="SELECT * FROM listadoConsignatariosF();", nativeQuery = true)
	List<Consignatario> listadoConsignatario();
	
	@Query(value="CALL crearConsignatario(:nombreconsignatario);", nativeQuery = true)
	Long creacionConsignatario(@Param("nombreconsignatario") String nombreconsignatario);
}
