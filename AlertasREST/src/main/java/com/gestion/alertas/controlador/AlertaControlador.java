package com.gestion.alertas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.alertas.modelo.Alerta;
import com.gestion.alertas.service.AlertaService;

@RestController
public class AlertaControlador {

	@Autowired
	private AlertaService servicio;
	
	//Llamado a todas las alertas de la base de datos
	
	@GetMapping("/alertas")
	public List<Alerta> listarAlertas(){
		return servicio.listarAlertas();
		}

	//Llamado a una alerta porID
	
	@GetMapping("/alertas/{id}")
		public Alerta obtenerAlerta(@PathVariable Integer id) {
			return servicio.obtenerAlertaPorId(id);
		}
	}
	

