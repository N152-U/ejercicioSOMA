package com.ansm.ejercicioSOMA.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;



@Data
@Entity
@Table(name = "cliente")

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="clienteid")
	private Long clienteid;
	
	@Column(name="clienteactivo")
	private Boolean clienteactivo;
	
	@Column(name="clientenombre")
	//@Size(min = 3,max = 20)
	private String clientenombre;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="clientefechacreacion")
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
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="clientefechamodificacion")
	private Date clientefechamodificacion;
}
