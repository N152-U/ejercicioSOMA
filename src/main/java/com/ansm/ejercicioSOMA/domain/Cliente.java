package com.ansm.ejercicioSOMA.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Cliente {

	private Long clienteid;
	private Boolean clienteactivo;
	private String clientenombre;
	private Date clientefechacreacion;

	public Long getClienteid() {
		return clienteid;
	}

	public void setClienteid(Long clienteid) {
		this.clienteid = clienteid;
	}

	public Boolean getClienteactivo() {
		return clienteactivo;
	}

	public void setClienteactivo(Boolean clienteactivo) {
		this.clienteactivo = clienteactivo;
	}

	public String getClientenombre() {
		return clientenombre;
	}

	public void setClientenombre(String clientenombre) {
		this.clientenombre = clientenombre;
	}

	public Date getClientefechacreacion() {
		return clientefechacreacion;
	}

	public void setClientefechacreacion(Date clientefechacreacion) {
		this.clientefechacreacion = clientefechacreacion;
	}

	public Date getClientefechamodificacion() {
		return clientefechamodificacion;
	}

	public void setClientefechamodificacion(Date clientefechamodificacion) {
		this.clientefechamodificacion = clientefechamodificacion;
	}

	private Date clientefechamodificacion;
}
