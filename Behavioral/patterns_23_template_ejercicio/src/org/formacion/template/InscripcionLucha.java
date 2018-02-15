package org.formacion.template;

public class InscripcionLucha {

	private final Torneo torneo;
	private final Polideportivo polideportivo;

	public InscripcionLucha(Polideportivo polideportivo) {
		this.polideportivo = polideportivo;
		this.torneo = new Torneo("torneo lucha");
	}
	
	public Torneo getTorneo() {
		return torneo;
	}

	public boolean apunta (Solicitud solicitud) {
		
		if (solicitud.getEdat() < 15) {
			// menores de 15 no pueden apuntarse
			return false;
		}
		
		if (solicitud.getPeso() < 60) {
			// peso minimo, 60 kilos
			return false;
		}
		
		if (torneo.getAceptadas().size() >= 6) {
			// solo pueden participar 6 personas
			return false;
		}
		
		torneo.apunta(solicitud);
	
		
		if (torneo.getAceptadas().size() == 6) {
			// plazas llenas -> reservamos polideportivo
			// El tiempo estimado del torneo son 4 horas
			polideportivo.reserva(torneo, 4);
		}

		return true;
	}

}
