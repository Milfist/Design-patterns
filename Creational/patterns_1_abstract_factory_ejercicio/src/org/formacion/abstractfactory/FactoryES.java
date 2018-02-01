package org.formacion.abstractfactory;

public class FactoryES implements AbstractFactory{

	@Override
	public Preguntas createPregunta() {
		return new PreguntasEs();
	}

	@Override
	public Saludos createSaludo() {
		return new SaludosEs();
	}

}
