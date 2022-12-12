package com.gestion.alertas.model;

import com.gestion.alertas.entity.Alerta;

public class MAlerta {

	private Integer id;

	private String fecha;

	private String id_producto;
//Constructor con todos los parametros
	public MAlerta(Integer id, String fecha, String id_producto) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.id_producto = id_producto;
	}
	//Constructor sin ID
	public MAlerta(String fecha, String id_producto) {
		super();
		this.fecha = fecha;
		this.id_producto = id_producto;
	}
	//Constructor vacio
	public MAlerta() {
		super();
	}
	//Constrcutor de prueba cambio
	public MAlerta(Alerta alerta) {
		super();
		this.id = alerta.getId();
		this.fecha = alerta.getFecha();
		this.id_producto = alerta.getId_producto();
	}

	//Getters and setters
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
		return id_producto;
	}

	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}

}
