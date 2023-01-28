package com.ansm.ejercicioSOMA.controladores;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ansm.ejercicioSOMA.domain.Cliente;
import com.ansm.ejercicioSOMA.domain.Consignatario;
import com.ansm.ejercicioSOMA.servicios.IClienteServicio;
import com.ansm.ejercicioSOMA.servicios.IConsignatarioServicio;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j

public class ConsignatarioControlador {
	
	@Autowired
	private IConsignatarioServicio consignatarios;
	@Autowired
	private IClienteServicio clientes;
	
	
	@GetMapping("listadoConsignatarios")
	public String listaclientes(Model modelo) {
		List<Consignatario> listado = new ArrayList<Consignatario>();
		listado=	consignatarios.listadoConsignatario();
		modelo.addAttribute("listado", listado);
		return "consignatarios/listadoConsignatarios";
	}
	
	@GetMapping("nuevoConsignatario")
	public String creacionConsignatario(Model modelo) {
		List<Cliente> listado = new ArrayList<Cliente>();
		listado=	clientes.listadoClientes();
		modelo.addAttribute("listado", listado);
		return "consignatarios/creacionConsignatario";
	}
	
	@RequestMapping(value = "/guardarConsignatario", method = RequestMethod.POST)
	@ResponseBody
	public String guardarConsignatario(@RequestBody Consignatario consignatario) {
		
		consignatarios.creacionConsignatario(consignatario.getConsignatarionombre());
		return "Cliente creado";
	}
	

	
}
