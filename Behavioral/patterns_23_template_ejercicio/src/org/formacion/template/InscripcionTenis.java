package org.formacion.template;

public class InscripcionTenis {

	private final Torneo torneo;
	private final Polideportivo polideportivo;
	
	public InscripcionTenis(Polideportivo polideportivo) {
		this.polideportivo = polideportivo;
		this.torneo = new Torneo("torneo tenis");
	}
	
	public Torneo getTorneo() {
		return torneo;
	}

	public boolean apunta (Solicitud solicitud) {
		
		if (solicitud.getEdat() < 10) {
			// menores de 10 no pueden apuntarse
			return false;
		}
		
		if (torneo.getAceptadas().size() >= 4) {
			// solo pueden participar 4 personas
			return false;
		}
		
		torneo.apunta(solicitud);
		
		if (torneo.getAceptadas().size() == 4) {
			// plazas llenas -> reservamos polideportivo
			// El tiempo estimado del torneo son 8 horas
			polideportivo.reserva(torneo, 8);
		}
		
		return true;
	}
	
}
