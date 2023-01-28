package com.ansm.ejercicioSOMA.controladores;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ansm.ejercicioSOMA.domain.Cliente;
import com.ansm.ejercicioSOMA.domain.Consignatario;
import com.ansm.ejercicioSOMA.servicios.IClienteServicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j

public class ConsignatarioControlador {
	
	@Autowired
	private IClienteServicio clientes;
	
	
	@GetMapping("listadoConsignatarios")
	public String listaclientes(Model modelo) {
		/*List<Consignatario> listado = new ArrayList<Cliente>();
		listado=	clientes.listadoClientes();
		modelo.addAttribute("listado", listado);*/
		return "consignatarios/listadoConsignatarios";
	}
}
