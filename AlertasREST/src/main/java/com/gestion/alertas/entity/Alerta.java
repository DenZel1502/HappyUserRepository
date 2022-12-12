package com.gestion.alertas.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alerta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String fecha;
	private String iddispositivo;

	public Alerta(Integer id, String fecha, String iddispositivo) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.iddispositivo = iddispositivo;
	}

	public Alerta(String fecha, String iddispositivo) {
		super();
		this.fecha = fecha;
		this.iddispositivo = iddispositivo;
	}

	public Alerta() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getId_producto() {
		return iddispositivo;
	}

	public void setId_producto(String iddispositivo) {
		this.iddispositivo = iddispositivo;
	}

}
