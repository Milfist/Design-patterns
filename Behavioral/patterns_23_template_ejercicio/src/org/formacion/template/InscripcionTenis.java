package org.formacion.template;

public class InscripcionTenis extends Inscripcion {

	private final Torneo torneo;
	private final Polideportivo polideportivo;

	public InscripcionTenis(Polideportivo polideportivo) {
		this.polideportivo = polideportivo;
		this.torneo = new Torneo("torneo tenis");
	}

	public Torneo getTorneo() {
		return torneo;
	}

	@Override
	public boolean getEdad(Solicitud solicitud) {
		return solicitud.getEdat() < 10 ? false : true;
	}

	@Override
	public boolean getPeso(Solicitud solicitud) {
		return true;
	}

	@Override
	public boolean getAceptadas() {
		return this.torneo.getAceptadas().size() >= 4 ? false : true;
	}

	@Override
	public void apuntar(Solicitud solicitud) {
		this.torneo.apunta(solicitud);
	}

	@Override
	public void hacerReserva() {
		if (torneo.getAceptadas().size() == 4) {
			polideportivo.reserva(torneo, 8);
		}
	}

}
