package com.gestion.alertas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gestion.alertas.converter.Convertidor;
import com.gestion.alertas.entity.Alerta;
import com.gestion.alertas.repositorio.AlertaRepository;

@Service("servicio")
public class AlertaService {

	@Autowired
	@Qualifier("repositorio")
	private AlertaRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public List<Alerta> listarAlertas(){
		return repositorio.findAll();	
	}
	
	public List<Alerta> listasAlertasPorDispo(String iddispositivo){
		return repositorio.findByIddispositivo(iddispositivo);
	}
	
	
	
	public void guardarAlerta(Alerta alerta) {
		repositorio.save(alerta);
	}
	
	public Alerta obtenerAlertaPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public void eliminarAlerta(Integer id) {
		 repositorio.deleteById(id);
	}
}
