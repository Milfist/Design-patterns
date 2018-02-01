package org.formacion.abstractfactory;

public class FactoryEN implements AbstractFactory{

	@Override
	public Preguntas createPregunta() {
		return new PreguntasEn();
	}

	@Override
	public Saludos createSaludo() {
		return new SaludosEn();
	}

}
