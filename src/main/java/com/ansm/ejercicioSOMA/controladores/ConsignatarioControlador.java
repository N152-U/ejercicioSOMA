package com.ansm.ejercicioSOMA.controladores;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j

public class ConsignatarioControlador {
	@GetMapping("listadoConsignatarios")
	public String listaclientes(Model modelo) {

		return "consignatarios/listadoConsignatarios";
	}
}
