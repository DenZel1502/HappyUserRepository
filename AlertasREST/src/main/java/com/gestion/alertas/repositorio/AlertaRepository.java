package com.gestion.alertas.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.alertas.entity.Alerta;

@Repository("repositorio")
public interface AlertaRepository extends JpaRepository<Alerta,Serializable>{

	
	public abstract List<Alerta> findByIddispositivo(String iddispositivo); 
	
	
	
		
}
