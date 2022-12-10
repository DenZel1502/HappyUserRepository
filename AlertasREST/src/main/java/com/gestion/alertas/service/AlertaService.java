package com.gestion.alertas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.alertas.modelo.Alerta;
import com.gestion.alertas.repositorio.AlertaRepository;

@Service
public class AlertaService {

	@Autowired
	private AlertaRepository repositorio;
	
	public List<Alerta> listarAlertas(){
		return repositorio.findAll();	
	}
	
	//public List<Alerta> listasAlertasPorDispo(Integer id_producto){
		//return repositorio.findByIdproducto();
	//}
	
	
	
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
