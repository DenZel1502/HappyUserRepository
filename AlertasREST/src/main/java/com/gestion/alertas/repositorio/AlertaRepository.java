package com.gestion.alertas.repositorio;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.alertas.modelo.Alerta;

public interface AlertaRepository extends JpaRepository<Alerta,Integer>{

//	public abstract List<Alerta> findByIdproducto(Integer id_producto);
}
