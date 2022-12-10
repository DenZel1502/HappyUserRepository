package com.gestion.alertas.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alerta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String fecha;
	private Integer id_producto;

	public Alerta(Integer id, String fecha, Integer id_producto) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.id_producto = id_producto;
	}

	public Alerta(String fecha, Integer id_producto) {
		super();
		this.fecha = fecha;
		this.id_producto = id_producto;
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

	public Integer getId_prpducto() {
		return id_producto;
	}

	public void setId_prpducto(Integer id_prpducto) {
		this.id_producto = id_prpducto;
	}

}
