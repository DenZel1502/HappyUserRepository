package com.gestion.alertas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.alertas.entity.Alerta;
import com.gestion.alertas.model.MAlerta;
import com.gestion.alertas.service.AlertaService;

@RestController
@RequestMapping("/v1")
public class AlertaControlador {

	@Autowired
	@Qualifier("servicio")
	private AlertaService servicio;
	
	//Llamado a todas las alertas de la base de datos
	
	@GetMapping("/alertas")
	public List<Alerta> listarAlertas(){
		return servicio.listarAlertas();
		}

	//Llamado a una alerta porID
	
	@GetMapping("/alertas/{id}")
		public ResponseEntity<Alerta> obtenerAlerta(@PathVariable Integer id) {
			try {
				Alerta alerta = servicio.obtenerAlertaPorId(id);
				return new ResponseEntity<Alerta>(alerta,HttpStatus.OK);
			}catch(Exception exception){
				return new ResponseEntity<Alerta>(HttpStatus.NOT_FOUND);
			}
		}
	
	@GetMapping("/alertas/bdis/{iddispositivo}")
		public List<Alerta> obtenerAlertasporDisp(@PathVariable String iddispositivo){
		return servicio.listasAlertasPorDispo(iddispositivo);
	}
	
	@PostMapping("/alertas")
		public void guardarAlerta(@RequestBody Alerta alerta) {
			servicio.guardarAlerta(alerta);
	}
	
	@PutMapping("/alertas/{id}")
		public ResponseEntity<?> actualizarAlerta(@RequestBody Alerta alerta,@PathVariable Integer Id){
			try {
				Alerta alertaExistente = servicio.obtenerAlertaPorId(Id);
				servicio.guardarAlerta(alerta);
				return new ResponseEntity<Alerta>(alerta,HttpStatus.OK);
			}catch(Exception exception) {
				return new ResponseEntity<Alerta>(HttpStatus.NOT_FOUND);
			}
	}
	
	
	@DeleteMapping("/alertas/{id}")
		public void eliminarAlerta(@PathVariable Integer id) {
		servicio.eliminarAlerta(id);
	}
		
	
	}
	

