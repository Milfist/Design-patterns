package org.formacion.template;

public class InscripcionLucha extends Inscripcion {

	private final Torneo torneo;
	private final Polideportivo polideportivo;

	public InscripcionLucha(Polideportivo polideportivo) {
		this.polideportivo = polideportivo;
		this.torneo = new Torneo("torneo lucha");
	}

	public Torneo getTorneo() {
		return torneo;
	}

	@Override
	public boolean getEdad(Solicitud solicitud) {
		return solicitud.getEdat() < 15 ? false : true;
	}

	@Override
	public boolean getPeso(Solicitud solicitud) {
		return solicitud.getPeso() < 60 ? false : true;
	}

	@Override
	public boolean getAceptadas() {
		return torneo.getAceptadas().size() >= 6 ? false : true;
	}

	@Override
	public void apuntar(Solicitud solicitud) {
		this.torneo.apunta(solicitud);
	}

	@Override
	public void hacerReserva() {
		if (torneo.getAceptadas().size() == 6) {
			polideportivo.reserva(torneo, 4);
		}
	}

}
