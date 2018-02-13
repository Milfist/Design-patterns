package org.formacion.mediator;

public class MediatorImpl {
	
	private Telefono telefono;
	private Radio radio;
	private Coche coche;
	
	public MediatorImpl(Telefono telefono, Radio radio, Coche coche) {
		this.telefono = telefono;
		this.radio = radio;
		this.coche = coche;
	}
	
	public void enciendeCoche() {
		radio.enciende();
		telefono.apagaMusica();
	}

	public void apagaCoche() {
		radio.apaga();
	}
	
	public void enciendeRadio() {
		radio.enciende();
		telefono.apagaMusica();
	}
	
	public void apagaRadio() {
		radio.apaga();
	}
	
	public void recibeLlamadaTel() {
		radio.apaga();
	}
	
	public void enciendeMusicaTel() {
		telefono.enciendeMusica();
	}
	
	public Telefono getTelefono() {
		return telefono;
	}

	public Radio getRadio() {
		return radio;
	}

	public Coche getCoche() {
		return coche;
	}
}
