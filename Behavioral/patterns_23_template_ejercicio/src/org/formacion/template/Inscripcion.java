package org.formacion.template;

public abstract class Inscripcion {

	public boolean apunta(Solicitud solicitud) {

		if (!getEdad(solicitud)) {
			return false;
		}

		if (!getPeso(solicitud)) {
			return false;
		}

		if (!getAceptadas()) {
			return false;
		}

		apuntar(solicitud);

		hacerReserva();

		return true;
	}
	
	public abstract boolean getEdad(Solicitud solicitud);
	public abstract boolean getPeso(Solicitud solicitud);
	public abstract boolean getAceptadas();
	public abstract void apuntar(Solicitud solicitud);
	public abstract void hacerReserva();
	
	
}
