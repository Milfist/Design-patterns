package org.formacion.template;

import java.util.HashMap;
import java.util.Map;

public class Polideportivo {

	private Map<Torneo, Integer> reservas = new HashMap<>();
	
	public void reserva(Torneo torneo, int horas) {
		reservas.put(torneo, horas);
	}

	public Map<Torneo, Integer> getReservas() {
		return reservas;
	}
}
