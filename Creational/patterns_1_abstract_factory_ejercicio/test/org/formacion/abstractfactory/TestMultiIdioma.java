package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		
		FactoryES factory = new FactoryES();
		
		Preguntas preguntas = factory.createPregunta();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		
		Saludos saludos = factory.createSaludo();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		
		FactoryEN factory = new FactoryEN();
		
		Preguntas preguntas = factory.createPregunta();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		Saludos saludos = factory.createSaludo();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}
