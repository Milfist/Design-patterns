package org.formacion.mediator;

public class Radio {

	private boolean encendida = false;

	public void enciende() {
		encendida = true; 
	}
	
	public void apaga() {
		encendida = false; 
	}
	
	public boolean encendida() {
		return encendida;
	}
}
