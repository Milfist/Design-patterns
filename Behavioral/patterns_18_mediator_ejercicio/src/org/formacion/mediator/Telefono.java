package org.formacion.mediator;

public class Telefono {

	private boolean musicaOn = false;

	public void enciendeMusica() {
		musicaOn = true;
	}
	
	public void apagaMusica() {
		musicaOn = false;
	}
	
	public boolean musicaEncendida() {
		return musicaOn;
	}
}
