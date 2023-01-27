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
import com.ansm.ejercicioSOMA.servicios.ClienteServicio;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class ClienteControlador {
	
	private ClienteServicio clientes;
	
	@GetMapping("/")
	public String inicio(Model modelo) {
		Cliente cliente = new Cliente();
		cliente.setClientenombre("Naraly");

		String mensaje = "Hello worldfss";
		modelo.addAttribute("mensaje", mensaje);
		modelo.addAttribute("cliente", cliente);
		return "index";
	}
	
	@RequestMapping(value = "/guardarCliente", method = RequestMethod.POST)
	@ResponseBody
	public String guardarCliente(@RequestBody Cliente cliente) {
		return "Hola";
	}
}
