package org.milfist.flyweight;

public class JugadorImpl implements Jugador {

	private String numero;
	private Camiseta camiseta;
	
	public JugadorImpl(String numero) {
		this.numero = numero;
	}

	@Override
	public String dibuja() {
		this.camiseta = FactoriaCamisetas.crearCamiseta(this.numero);
		return this.camiseta.getCamiseta();
	}

}
