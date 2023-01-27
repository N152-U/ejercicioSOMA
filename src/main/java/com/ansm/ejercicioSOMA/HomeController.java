package com.ansm.ejercicioSOMA;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ansm.ejercicioSOMA.domain.Cliente;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {

		Cliente cliente = new Cliente();
		cliente.setClientenombre("Naraly");

		String mensaje = "Hello worldfss";
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("cliente", cliente);
		return "index";
	}

	@RequestMapping(value = "/guardarCliente", method = RequestMethod.POST)
	@ResponseBody
	public String guardarCliente(@RequestBody Cliente cliente) {
		return "Hola";
	}

}
