package com.ansm.ejercicioSOMA.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "consignatario")
public class Consignatario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="clienteid")
	private Long clienteid;
	
	@Column(name="consignatarioid")
	private Integer consignatarioid;
	
	@Column(name="consignatarioactivo")
	private Boolean consignatarioactivo;
	
	@Column(name="consignatarionombre")
	private String consignatarionombre;
	
	@Column(name="consignatariofechacreacion")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date consignatariofechacreacion;

	@Column(name="consignatariofechamodificacion")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date consignatariofechamodificacion;
	
	public Consignatario() {
		// TODO Auto-generated constructor stub
	}

	public Long getClienteid() {
		return clienteid;
	}

	public void setClienteid(Long clienteid) {
		this.clienteid = clienteid;
	}

	public Integer getConsignatarioid() {
		return consignatarioid;
	}

	public void setConsignatarioid(Integer consignatarioid) {
		this.consignatarioid = consignatarioid;
	}

	public Boolean getConsignatarioactivo() {
		return consignatarioactivo;
	}

	public void setConsignatarioactivo(Boolean consignatarioactivo) {
		this.consignatarioactivo = consignatarioactivo;
	}

	public String getConsignatarionombre() {
		return consignatarionombre;
	}

	public void setConsignatarionombre(String consignatarionombre) {
		this.consignatarionombre = consignatarionombre;
	}

	public Date getConsignatariofechacreacion() {
		return consignatariofechacreacion;
	}

	public void setConsignatariofechacreacion(Date consignatariofechacreacion) {
		this.consignatariofechacreacion = consignatariofechacreacion;
	}

	public Date getConsignatariofechamodificacion() {
		return consignatariofechamodificacion;
	}

	public void setConsignatariofechamodificacion(Date consignatariofechamodificacion) {
		this.consignatariofechamodificacion = consignatariofechamodificacion;
	}
	
	
}
