package org.milfist.flyweight;

public class FactoriaCamisetas {
	public static Camiseta crearCamiseta(String numero) {
		Camiseta camiseta = ContenedorCamisetas.getCamiseta(numero);
		return camiseta;
	}
}
