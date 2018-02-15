package org.formacion.template;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

	private String nombre;
	private List<Solicitud> aceptadas;
	
	public Torneo(String nombre) {
		aceptadas = new ArrayList<>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public List<Solicitud> getAceptadas() {
		return aceptadas;
	}

	public void apunta (Solicitud solicitud) {
		aceptadas.add(solicitud);
	}

}
