package org.formacion.mediator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSistema {

	private Radio radio;
	private Telefono telefono;
	private Coche coche;
	private MediatorImpl m;
	
	@Before
	public void init() {
		radio = new Radio();
		telefono = new Telefono();
		coche = new Coche();
		
		m = new MediatorImpl(telefono, radio, coche);
	}
	
	@Test
	public void test_encender_apagar_coche() {
		assertFalse(m.getRadio().encendida());
		assertFalse(m.getTelefono().musicaEncendida());
		
		m.enciendeMusicaTel();
		assertTrue(m.getTelefono().musicaEncendida());
		
		m.enciendeCoche();
		
		assertTrue(m.getRadio().encendida());
		assertFalse(m.getTelefono().musicaEncendida());
	
		m.apagaCoche();
		assertFalse(m.getRadio().encendida());
	}

	@Test
	public void test_suena_telefono() {
		m.enciendeRadio();
		assertTrue(m.getRadio().encendida());
		
		m.recibeLlamadaTel();
		
		assertFalse(m.getRadio().encendida());
	}
	
	@Test
	public void test_enciende_radio() {
		
		m.enciendeMusicaTel();
		assertTrue(m.getTelefono().musicaEncendida());
		
		m.enciendeRadio();
		
		assertFalse(m.getTelefono().musicaEncendida());
	}
}
