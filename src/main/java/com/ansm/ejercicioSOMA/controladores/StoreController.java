package com.ansm.ejercicioSOMA.controladores;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
import com.ansm.ejercicioSOMA.servicios.IClienteServicio;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j

public class StoreController {
	/*Rutas para tienda*/
	@GetMapping("homeStore")
	public String homeStore(Model modelo) {

		return "store/home";
	}
	@GetMapping("loginCustomer")
	public String loginCustomer(Model modelo) {
		return "store/loginCustomer";
	}
	@GetMapping("loginSalesperson")
	public String loginSalesperson(Model modelo) {
		return "store/loginSalesperson";
	}
	@GetMapping("customer/add")
	public String createCustomer(Model modelo) {
		return "store/createCustomer";
	}
	@GetMapping("salesperson/add")
	public String createSalesperson(Model modelo) {
		return "store/createSalesperson";
	}
	@GetMapping("dealer/add")
	public String createDealer(Model modelo) {
		return "store/createDealer";
	}
	@GetMapping("home")
	public String storeHome(Model modelo) {
		return "store/home";
	}
	@GetMapping("salesperson/view")
	public String viewSalesperson(Model modelo) {
		return "store/viewSalesperson";
	}
	@GetMapping("getStore")
	public String getStore(Model modelo) {
		return "store/getStore";
	}
	@GetMapping("getDealers")
	public String getDealers(Model modelo) {
		return "store/getDealers";
	}
	@GetMapping("getCustomers")
	public String getCustomer(Model modelo) {
		return "store/getCustomers";
	}
	@GetMapping("getHistory")
	public String getHistory(Model modelo) {
		return "store/getHistory";
	}
	@GetMapping("createSale")
	public String createSale(Model modelo) {
		return "store/createSale";
	}
}
