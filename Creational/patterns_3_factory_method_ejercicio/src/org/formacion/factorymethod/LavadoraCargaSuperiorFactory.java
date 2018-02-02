package org.formacion.factorymethod;

public class LavadoraCargaSuperiorFactory extends LavadoraFactory {

	@Override
	protected Lavadora creaLavadora() {
		return new LavadoraCargaSuperior();
	}

}
