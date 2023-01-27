package com.ansm.ejercicioSOMA.controladores;

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
	
	private IClienteServicio clientes;
	
	@GetMapping("/")
	public String inicio(Model modelo) {
		Cliente cliente = new Cliente();
		cliente.setClientenombre("Naraly");

		String mensaje = "Hello worldfss";
		modelo.addAttribute("mensaje", mensaje);
		modelo.addAttribute("cliente", cliente);
		return "index";
	}
	
	@GetMapping("listaclientes")
	public String listaclientes(@RequestParam(name="page",defaultValue = "0")int page, Model modelo) {
		Pageable pagReq=PageRequest.of(page,2);
		Page<Cliente> cl=clientes.findAll(pagReq);
		RenderPagina<Cliente> render=new RenderPagina<>("listaclientes", cl);
		modelo.addAttribute("cls", cl);
		modelo.addAttribute("page", render);
		return "/clientes/listadoClientes";
	}
	
	@RequestMapping(value = "/guardarCliente", method = RequestMethod.POST)
	@ResponseBody
	public String guardarCliente(@RequestBody Cliente cliente) {
		return "Hola";
	}
	
	@GetMapping("listadoClientes")
	public String listaclientes(Model modelo) {

		return "clientes/listadoClientes";
	}
}
