package com.ansm.ejercicioSOMA.domain;

import lombok.Data;

@Data
public class Consignatario {

	private Long clienteid;
	private String consignatarioid;
	private String consignatarioactivo;
	private String consignatarionombre;
	private String consignatariofechacreacion;

	public Long getClienteid() {
		return clienteid;
	}

	public void setClienteid(Long clienteid) {
		this.clienteid = clienteid;
	}

	public String getConsignatarioid() {
		return consignatarioid;
	}

	public void setConsignatarioid(String consignatarioid) {
		this.consignatarioid = consignatarioid;
	}

	public String getConsignatarioactivo() {
		return consignatarioactivo;
	}

	public void setConsignatarioactivo(String consignatarioactivo) {
		this.consignatarioactivo = consignatarioactivo;
	}

	public String getConsignatarionombre() {
		return consignatarionombre;
	}

	public void setConsignatarionombre(String consignatarionombre) {
		this.consignatarionombre = consignatarionombre;
	}

	public String getConsignatariofechacreacion() {
		return consignatariofechacreacion;
	}

	public void setConsignatariofechacreacion(String consignatariofechacreacion) {
		this.consignatariofechacreacion = consignatariofechacreacion;
	}

	public String getConsignatariofechamodificacion() {
		return consignatariofechamodificacion;
	}

	public void setConsignatariofechamodificacion(String consignatariofechamodificacion) {
		this.consignatariofechamodificacion = consignatariofechamodificacion;
	}

	private String consignatariofechamodificacion;
}
