package com.ansm.ejercicioSOMA.controladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ansm.ejercicioSOMA.domain.Cliente;
import com.ansm.ejercicioSOMA.servicios.IClienteServicio;
import com.ansm.ejercicioSOMA.utilerias.RenderPagina;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class ClienteControlador {
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cliente");
//	EntityManager em = emf.createEntityManager();

	@Autowired
	private IClienteServicio clientes;
	
	@GetMapping("/")
	public String inicio(Model modelo) {
		return "index";
	}
	

	@RequestMapping(value = "/guardarCliente", method = RequestMethod.POST)
	@ResponseBody
	public String guardarCliente(@RequestBody Cliente cliente) {
		
		 clientes.creacionCliente(cliente.getClientenombre());
		return "Cliente creado";
	}
	
	@GetMapping("listadoClientes")
	public String listaclientes(Model modelo) {
		List<Cliente> listado = new ArrayList<Cliente>();
		listado=	clientes.listadoClientes();
		modelo.addAttribute("listado", listado);

		return "clientes/listadoClientes";
	}
	
	@GetMapping("nuevoCliente")
	public String creacionCliente(Model modelo) {

		return "clientes/creacionCliente";
	}
}
