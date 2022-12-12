package com.gestion.alertas.converter;
import com.gestion.alertas.entity.*;
import com.gestion.alertas.model.MAlerta;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("convertidor")
public class Convertidor {
	public List<MAlerta> convertirLista(List<Alerta> alertas){
		List<MAlerta> malertas = new ArrayList<>();
		
		for(Alerta alerta : alertas) {
			malertas.add(new MAlerta(alerta));
		}
		return malertas;
	}
}
